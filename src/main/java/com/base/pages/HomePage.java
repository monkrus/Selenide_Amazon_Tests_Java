package com.base.pages;

import com.base.locators.HomePageLocators;
import ru.yandex.qatools.allure.annotations.Step;

import static com.base.utils.PropertiesReader.getProperty;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends HomePageLocators {

    @Step
    public HomePage openHomePage() {
        open(getProperty("URL"));
        return this;
    }

}
