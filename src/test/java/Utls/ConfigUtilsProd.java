package Utls;

import java.util.Properties;

public class ConfigUtilsProd {
    private Properties properties;
    private static ConfigUtilsProd configUtilsStg;

    public ConfigUtilsProd(){
        String env= System.getProperty("env","UnityPROD");
        switch (env){
            case "UnityPROD":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Unity_PROD.properties");
                break;
            case "UnitySTG" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Unity_STG.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static ConfigUtilsProd getInstance(){
        if (configUtilsStg ==null){
            configUtilsStg =new ConfigUtilsProd();
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

