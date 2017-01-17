package com.base.listeners;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;

public class ScreenshotOnFailure extends TestListenerAdapter {

    @Override
    public final void onTestFailure(ITestResult iTestResult) {
        try {
            attachBrowserScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "{0}", type = "image/png")
    private byte[] attachBrowserScreenshot() throws IOException {
        File screenshot = Screenshots.getLastScreenshot();
        return Files.toByteArray(screenshot);
    }

}
