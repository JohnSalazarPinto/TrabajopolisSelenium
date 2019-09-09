/*
 * @(#) TrabajopolisConfig.java Copyright (c) 2019 Jala Foundation.
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
 * TrabajopolisConfig class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public final class TrabajopolisConfig {
    private InputStream input;
    private Properties properties;
    private String username;
    private String password;
    private String url;
    private String urlAccount;
    private static TrabajopolisConfig amazonConfig;

    /**
     * Constructor sets properties.
     */
    private TrabajopolisConfig() {
        properties = config();
    }

    /**
     * Gets instance for init properties.
     *
     * @return amazonConfig
     */
    public static TrabajopolisConfig getInstance() {
        if (amazonConfig == null) {
            amazonConfig = new TrabajopolisConfig();
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
            input = new FileInputStream(System.getProperty("user.dir") + "/trabajopolis.properties");
            properties = new Properties();
            properties.load(input);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            urlAccount = properties.getProperty("urlAccount");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * Gets username.
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
     * @return url - TrabajopolisUtils url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets urlAccount.
     *
     * @return urlAccount - TrabajopolisUtils url.
     */
    public String getUrlAccount() {
        return urlAccount;
    }
}
