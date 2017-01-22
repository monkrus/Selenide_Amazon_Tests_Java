package com.tests.home;

import com.base.SelenideBaseTest;
import com.base.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static com.base.utils.PropertiesReader.getProperty;

@Features("LogOut")
@Stories("LogOut")
public class LogOut extends SelenideBaseTest {

    @BeforeMethod
    void precondition() {
        new HomePage()
                .openHomePage()
                .clickOnAccountListMenu()
                .enterEmail(getProperty("EMAIL"))
                .enterPassword(getProperty("PASSWORD"))
                .clickSignInButton();
    }

    @Test
    void logout() {
        new HomePage()
                .hoverMouseOverAccountListMenu()
                .clickOnSignOutOption()
                .checkThatUserIsOnLogInPage();
    }

}
