package com.tests;

import com.base.pages.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class SelenideBaseTest {

    @BeforeTest(alwaysRun = true)
    void before(){
        WebDriverRunner.isChrome();
        Configuration.browser.equals("Chrome");
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        new LoginPage()
                .openLoginPage();
    }

    @AfterTest(alwaysRun = true)
    void after() {
        closeWebDriver();
        clearBrowserCache();
    }

}
