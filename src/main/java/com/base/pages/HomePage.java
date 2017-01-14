package com.base.pages;

import com.base.locators.HomePageLocators;
import com.codeborne.selenide.Condition;
import ru.yandex.qatools.allure.annotations.Step;

import static com.base.utils.PropertiesReader.getProperty;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends HomePageLocators {

    @Step
    public HomePage openHomePage() {
        open(getProperty("URL"));
        return this;
    }

    public HomePage enterTextToSearchField(String text) {
        $(SEARCH_FIELD_LOCATOR).sendKeys(text);
        $(SEARCH_RESUL_DROPDOWN).shouldBe(Condition.visible);
        return this;
    }

}
