/*
 * @(#) AmazonConfig.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * AmazonConfig class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class AmazonConfig {

    InputStream input;
    Properties properties;
    String username;
    String password;
    String url;


    public static AmazonConfig amazonConfig;

    /**
     * Constructor sets properties.
     */
    private AmazonConfig() {
        properties = config();
    }

    /**
     * Gets instance for init properties
     *
     * @return amazonConfig
     */
    public static AmazonConfig getInstance() {
        if (amazonConfig == null) {
            amazonConfig = new AmazonConfig();
        }
        return amazonConfig;
    }

    /**
     * Gets values from amazon properties for the tests.
     *
     * @return properties - Properties with all data of the user.
     */
    public Properties config() {
        try {
            input = new FileInputStream(System.getProperty("user.dir") + "/amazon.properties");
            properties = new Properties();
            properties.load(input);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * Gets username
     *
     * @return username - Credential for login.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password.
     *
     * @return password - Credential for login.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets url.
     *
     * @return url - AmazonUtils url.
     */
    public String getUrl() {
        return url;
    }
}
