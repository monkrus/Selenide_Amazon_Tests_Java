package com.base.pages;

import com.base.Locators.LoginPageLocators;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.base.utils.PropertiesReader.loadProperty;

public class LoginPage extends LoginPageLocators {

    @Step
    public LoginPage openLoginPage() {
        open(loadProperty("URL"));
        return this;
    }

}
