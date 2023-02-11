package com.tmb.tests;

import com.tmb.config.ConfigFactory;
import com.tmb.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.Config;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

    // local, remote (selenium, selenoid, browserstack) : chrome, firefox

    @Test
    public void testLogin(){
        System.out.println(ConfigFactory.getConfig().browser());

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.co.in");
//        driver.quit();
    }


}
