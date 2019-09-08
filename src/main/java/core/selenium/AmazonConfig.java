package core.selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class AmazonConfig {

    InputStream input;
    Properties properties;
    String username;
    String password;
    String url;


    public static AmazonConfig amazonConfig;

    private AmazonConfig() {
        properties = config();
    }

    public static AmazonConfig getInstance() {
        if (amazonConfig == null) {
            amazonConfig = new AmazonConfig();
        }
        return amazonConfig;
    }

    public Properties config() {
        try {
            input = new FileInputStream(System.getProperty("user.dir") + "/amazon.properties");
            properties = new Properties();
            properties.load(input);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            System.out.println(password);
            System.out.println(username);
            url = properties.getProperty("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void main(String[] args) {
        AmazonConfig amazonConfig = new AmazonConfig();
        amazonConfig.getInstance();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
