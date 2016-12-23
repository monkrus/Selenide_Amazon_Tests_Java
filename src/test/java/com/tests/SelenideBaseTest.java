package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public abstract class SelenideBaseTest {

    @BeforeClass
    void setUp() {
        //TODO added common methods
    }

    @AfterMethod(alwaysRun = true)
    void after() {
        closeWebDriver();
        clearBrowserCache();
    }

}
