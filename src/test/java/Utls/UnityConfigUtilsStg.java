package Utls;

import java.util.Properties;

public class UnityConfigUtilsStg {
    private Properties properties;
    private static UnityConfigUtilsStg unityConfigUtilsStg;

    public UnityConfigUtilsStg(){
        String env= System.getProperty("env","UnityStg");
        switch (env){
            case "UnityStg":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Unity_STG.properties");
                break;
            case "UnityPROD" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Unity_PROD.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static UnityConfigUtilsStg getInstance(){
        if (unityConfigUtilsStg ==null){
            unityConfigUtilsStg =new UnityConfigUtilsStg();
        }
        return unityConfigUtilsStg;
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

