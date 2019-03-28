/*
Created by: Jorge Quiros
Last modified date: 03-27-2019
Description: Class with handy methods used along the solution.
 */

package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    //Method to load the properties from config.properties
    public static Properties loadProperties(){
        Properties prop = new Properties();
        InputStream input = null;

        String propertyFilePath = new File("")
                .getAbsolutePath() + "\\resources\\config.properties";

        try {

            input = new FileInputStream(propertyFilePath);

            // load a properties file
            prop.load(input);

           return prop;

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
