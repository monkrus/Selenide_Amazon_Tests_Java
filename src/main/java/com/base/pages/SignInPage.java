package com.base.pages;

import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    @Step
    public SignInPage enterEmail(String email) {
        $("#ap_email").sendKeys(email);
        return this;
    }

    @Step
    public SignInPage enterPassword(String password) {
        $("#ap_password").sendKeys(password);
        return this;
    }

    @Step
    public SignInPage clickSignInButton() {
        $("#signInSubmit").click();
        return this;
    }

}
