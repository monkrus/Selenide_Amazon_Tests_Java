package com.base.pages;

import com.base.locators.HomePageLocators;
import com.codeborne.selenide.Condition;
import ru.yandex.qatools.allure.annotations.Step;

import static com.base.utils.PropertiesReader.getProperty;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage extends HomePageLocators {

    @Step
    public HomePage openHomePage() {
        open(getProperty("URL"));
        return this;
    }

    @Step
    public HomePage enterTextToSearchField(String text) {
        $(SEARCH_FIELD_LOCATOR).sendKeys(text);
        $(SEARCH_RESULT_DROPDOWN).shouldBe(Condition.visible);
        return this;
    }

    @Step
    public HomePage selectDepartments() {
        $(SEARCH_DEPARTMENTS_DROPDOWN).shouldBe(Condition.visible);
        return this;
    }

    @Step
    public HomePage mouseHoverDepartmentMenu() {
        $("#nav-link-shopall .nav-line-2").hover();
        $("#nav-flyout-shopAll .nav-template.nav-flyout-content.nav-tpl-itemList").shouldBe(Condition.visible);
        return this;
    }

    @Step
    public HomePage clickOnElectronicAndComputerOption() {
        $(".nav-template.nav-flyout-content.nav-tpl-itemList [aria-label='Electronics & Computers']").click();
        return this;
    }

    public HomePage clickOnMonitorsSubMenu() {
        $(".nav-template.nav-subcat.nav-tpl-itemList.nav-colcount-2:nth-child(11) .nav-column.nav-column-notfirst.nav-column-break .nav-link.nav-item:nth-child(2) span").click();
        sleep(3000);
        return this;
    }
}
