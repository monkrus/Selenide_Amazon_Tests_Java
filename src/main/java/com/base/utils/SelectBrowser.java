package com.base.utils;

import com.codeborne.selenide.Configuration;

public class BrowserSelectionUtil {

    public static void selectBrowser(String browser) throws Exception {

        switch (browser) {
            case "Firefox":
                //TODO
                break;
            case "Chrome":
                Configuration.browser = "Chrome";
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
                break;
            case "IE":
                //TODO
                break;
            case "Safari":
                //TODO
                break;
            default:
                throw new IllegalStateException("Browser " + browser + " not supported in tests");
        }
    }

}
