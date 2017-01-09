package com.base.utils;

import com.base.SelenideBaseTest;

import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    protected final static Properties prop = new Properties();

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    @SuppressWarnings("TryFinallyCanBeTryWithResources")
    public static void readPropertiesFileWithAccountsTestData() throws IOException {
        InputStream inputStream = SelenideBaseTest.class.getClassLoader().getResourceAsStream("testdata.properties");
        try {
            Reader reader = new InputStreamReader(inputStream, "UTF-8");
            try {
                prop.load(reader);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } finally {
            inputStream.close();
        }
    }

}
