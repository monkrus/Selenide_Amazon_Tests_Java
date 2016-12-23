package com.tests.login;

import com.tests.SelenideBaseTest;
import com.base.pages.LoginPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static com.base.utils.Group.sanityTest;

@Features("Login page")
@Stories("Login page tests")
public class LoginTests extends SelenideBaseTest {

    @Title("Check ...")
    @Test(groups = {sanityTest})
    void checkTextOnLoginPage() {
        new LoginPage()
                .openLoginPage();
    }

}
