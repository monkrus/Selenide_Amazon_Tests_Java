package com.tests.home;

import com.base.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static com.base.utils.PropertiesReader.getProperty;

/**
 * Created by monk on 1/23/2017.
 */
@Features("LogOut")
@Stories("LogOut")
public class LogOut {
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

