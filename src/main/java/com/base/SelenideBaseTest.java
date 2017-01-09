package com.base;

import org.testng.annotations.*;

import static com.base.utils.PropertiesReader.getProperty;
import static com.base.utils.BrowserSelection.selectBrowser;
import static com.base.utils.PropertiesReader.readPropertiesFileWithAccountsTestData;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class SelenideBaseTest {

    @BeforeTest(alwaysRun = true)
    public void before() throws Exception {
        readPropertiesFileWithAccountsTestData();
        selectBrowser(getProperty("BROWSER"));

    }

    @AfterTest(alwaysRun = true)
    public void after() {
        closeWebDriver();
        clearBrowserCache();
    }

}
