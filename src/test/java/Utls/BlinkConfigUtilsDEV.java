package Utls;

import java.util.Properties;

public class BlinkConfigUtilsDEV {
    private Properties properties;
    private static BlinkConfigUtilsDEV configUtilsStg;

    public BlinkConfigUtilsDEV(){
        String env= System.getProperty("env","UnityDEV");
        switch (env){
            case "UnityDEV":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Blink_DEV.properties");
                break;
            case "UnitySTG" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Blink_STG.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static BlinkConfigUtilsDEV getInstance(){
        if (configUtilsStg ==null){
            configUtilsStg =new BlinkConfigUtilsDEV();
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

