package com.tests.home;

import com.base.SelenideBaseTest;
import com.base.pages.HomePage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static com.base.utils.PropertiesReader.getProperty;
import static com.base.utils.TestGroups.sanityTest;

/**
 * Created by monk on 1/23/2017.
 */
@Features("Login")
@Stories("Login")
public class LoginTo  extends SelenideBaseTest{

    @Title("Check ...")
    @Test(groups = {sanityTest})
    void clickOnDepartment() {
        new HomePage()
                .openHomePage()
                .clickOnAccountListMenu()
                .enterEmail(getProperty("EMAIL"))
                .enterPassword(getProperty("PASSWORD"))
                .clickSignInButton();
    }

}
