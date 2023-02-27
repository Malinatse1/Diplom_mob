package tests.android.selenide;

import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

        @Test
        void searchTest () {
            step("Type search", () -> {
                $(accessibilityId("Search Wikipedia")).click();
                $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
            });
            step("Verify content found", () ->
                    $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                            .shouldHave(sizeGreaterThan(0)));
        }
    }
