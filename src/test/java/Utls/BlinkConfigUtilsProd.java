package Utls;

import java.util.Properties;

public class BlinkConfigUtilsProd {
    private Properties properties;
    private static BlinkConfigUtilsProd configUtilsStg;

    public BlinkConfigUtilsProd(){
        String env= System.getProperty("env","UnityPROD");
        switch (env){
            case "UnityPROD":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Blink_PROD.properties");
                break;
            case "UnitySTG" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Blink_STG.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static BlinkConfigUtilsProd getInstance(){
        if (configUtilsStg ==null){
            configUtilsStg =new BlinkConfigUtilsProd();
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

