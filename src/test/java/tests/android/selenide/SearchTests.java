package tests.android.selenide;

import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.first;

public class SearchTests extends TestBase {

    @DisplayName("Проверка поиска")
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

    @DisplayName("Проверка перехода на статью при клике")
    @Test
    void goToArticleTest () {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
        });
        step("Click on the  article", () -> {
            $(id("org.wikipedia.alpha:id/fragment_feed_header")).click();
        });
        step("Click on the back button", () -> {
            $(id("org.wikipedia.alpha:id/view_wiki_error_button")).click();
        });
        step("Check visibility of header logo", () ->
                $(id("org.wikipedia.alpha:id/single_fragment_toolbar_wordmark"))
                        .shouldBe(visible));
    }
}
