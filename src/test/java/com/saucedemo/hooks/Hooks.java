package com.saucedemo.hooks;

import com.saucedemo.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Browser
{
    private Scenario scenario;
    @Before public void setUp()
    {
        this.scenario = scenario;
        launchBrowser("Chrome");
    }

    @After public void tearDown()
    {
        closeBrowser();
    }
}
