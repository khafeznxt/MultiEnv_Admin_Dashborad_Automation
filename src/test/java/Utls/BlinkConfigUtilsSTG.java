package Utls;

import java.util.Properties;

public class BlinkConfigUtilsSTG {
    private Properties properties;
    private static BlinkConfigUtilsSTG configUtilsStg;

    public BlinkConfigUtilsSTG(){
        String env= System.getProperty("env","UnitySTG");
        switch (env){
            case "UnitySTG":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Blink_STG.properties");
                break;
            case "UnityPROD" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Blink_STG.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static BlinkConfigUtilsSTG getInstance(){
        if (configUtilsStg ==null){
            configUtilsStg =new BlinkConfigUtilsSTG();
        }
        return configUtilsStg;
    }
    public  String BaseUrl(){
        String prop = properties.getProperty("baseUrl");
        if (prop!=null) return prop;
        throw new RuntimeException("couldn't found the base url at the property file");

    }
    public String getusername(){
        String prop = properties.getProperty("username");
        if (prop !=null) return prop;
        throw new RuntimeException("couldn't found the Email at the property file");

    }
    public String getPassword() {
        String prop = properties.getProperty("password");
        if (prop != null) return prop;
        throw new RuntimeException("couldn't found the password at the property file");
    }
}

