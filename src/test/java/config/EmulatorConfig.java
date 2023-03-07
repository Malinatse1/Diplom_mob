package config;

import org.aeonbits.owner.Config;

@EmulatorConfig.LoadPolicy(EmulatorConfig.LoadType.MERGE)
@Config.Sources(
        {"system:properties",
                "classpath:emulator.properties",
        })
public interface EmulatorConfig extends Config {
    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("appiumServer")
    String getAppiumServer();

    @Key("platformVersion")
    String getPlatformVersion();

    @Key("appPackage")
    String getAppPackage();

    @Key("appActivity")
    String getAppActivity();

    @Key("appURL")
    String appUrl();

    @Key("device")
    String device();

    @Key("os_version")
    String osVersion();

    @Key("project")
    String projectName();

    @Key("url")
    String url();

    @Key("name")
    String testName();
}
