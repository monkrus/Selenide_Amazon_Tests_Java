package com.base;

import com.base.listeners.ScreenshotOnFailure;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.base.utils.BrowserSelection.selectBrowser;
import static com.base.utils.PropertiesReader.getProperty;
import static com.base.utils.PropertiesReader.readPropertiesFileWithAccountsTestData;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

@Listeners(ScreenshotOnFailure.class)
public class SelenideBaseTest {

    @BeforeClass(alwaysRun = true)
    public void before() throws Exception {
        readPropertiesFileWithAccountsTestData();
        selectBrowser(getProperty("FIREFOX"));
    }

    @AfterClass(alwaysRun = true)
    public void after() {
        clearBrowserCache();
    }


}