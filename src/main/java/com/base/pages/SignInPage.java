package com.base.pages;

import com.codeborne.selenide.Condition;
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
    public HomePage clickSignInButton() {
        $("#signInSubmit").click();
        $("#nav-link-accountList .nav-line-1").shouldBe(Condition.visible);
        return new HomePage();
    }

    @Step
    public SignInPage checkThatUserIsOnLogInPage() {
        $("#ap_password").shouldBe(Condition.visible);
;        return this;
    }

}
