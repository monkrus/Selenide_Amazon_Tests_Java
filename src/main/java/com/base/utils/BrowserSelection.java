package com.base.utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class BrowserSelection {

    public static void selectBrowser(String browser) throws Exception {
        switch (browser) {
            case "Firefox":
                Configuration.browser = "Firefox";
                FirefoxDriverManager.getInstance().setup();
                break;
            case "Chrome":
                Configuration.browser = "Chrome";
                ChromeDriverManager.getInstance().setup();
                break;
            case "IE":
                Configuration.browser = "IE";
                InternetExplorerDriverManager.getInstance().setup();
                break;
            case "Safari":
                //TODO
                break;
            default:
                throw new IllegalStateException("Browser " + browser + " not supported in tests");
        }
    }

}
