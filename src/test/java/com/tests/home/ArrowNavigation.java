package com.tests.home;

import com.base.SelenideBaseTest;
import com.base.pages.HomePage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static com.base.utils.TestGroups.sanityTest;


@Features("Switch Navigation")
@Stories("Switch Navigation")
public class ArrowNavigation extends SelenideBaseTest {
    @Title("Check...")
    @Test(groups = {sanityTest})
    void ClickOnRibbon() {
        new HomePage()
                .openHomePage()
                .selectRightArrow()
                .selectRightArrow()
                .selectLeftArrow()
                .selectLeftArrow();



    }
}
