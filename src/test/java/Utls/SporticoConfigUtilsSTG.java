package Utls;

import java.util.Properties;

public class SporticoConfigUtilsSTG {
    private Properties properties;
    private static SporticoConfigUtilsSTG configUtilsStg;

    public SporticoConfigUtilsSTG(){
        String env= System.getProperty("env","SporticoSTG");
        switch (env){
            case "SporticoSTG":
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Sportico_STG.properties");
                break;
            case "SporticoPROD" :
                properties = PropertiesUtils.loadProperties("src/test/java/Config/Sportico_PROD.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }


    public static SporticoConfigUtilsSTG getInstance(){
        if (configUtilsStg ==null){
            configUtilsStg =new SporticoConfigUtilsSTG();
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

