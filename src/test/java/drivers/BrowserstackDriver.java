package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import javax.annotation.Nonnull;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {
    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);
    @SneakyThrows
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", config.login());
        mutableCapabilities.setCapability("browserstack.key", config.password());

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", config.appUrl());

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", config.device());
        mutableCapabilities.setCapability("os_version", config.osVersion());

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", config.projectName());
        mutableCapabilities.setCapability("build", config.buildName());
        mutableCapabilities.setCapability("name", config.testName());
        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above

        return new RemoteWebDriver( new URL("http://hub.browserstack.com/wd/hub"),mutableCapabilities);
    }
}
