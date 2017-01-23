package com.tests.home;

import com.base.SelenideBaseTest;
import com.base.pages.HomePage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static com.base.utils.TestGroups.sanityTest;

/**
 * Created by monk on 1/23/2017.
 */
@Features("Select department")
@Stories("Select department")
public class SelectDepartment extends SelenideBaseTest {
    @Title("Check ...")
    @Test(groups = {sanityTest})
    void clickOnDepartment() {
        new HomePage()
                .openHomePage()
                .mouseHoverDepartmentMenu()
                .clickOnElectronicAndComputerOption()
                .clickOnMonitorsSubMenu();
    }
}
