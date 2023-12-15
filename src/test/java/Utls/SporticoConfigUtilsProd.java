package Utls;

import java.util.Properties;

public class SporticoConfigUtilsProd {
    private Properties properties;
    private static SporticoConfigUtilsProd configUtilsStg;

    public SporticoConfigUtilsProd(){
        String env= System.getProperty("env","SporticoPROD");
        switch (env){
            case "SporticoPRODD":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Sportico_PROD.properties");
                break;
            case "SporticoSTG" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Sportico_STG.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static SporticoConfigUtilsProd getInstance(){
        if (configUtilsStg ==null){
            configUtilsStg =new SporticoConfigUtilsProd();
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

