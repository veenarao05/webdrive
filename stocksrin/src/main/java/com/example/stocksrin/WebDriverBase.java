package com.example.stocksrin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebDriverBase {
    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    //@Autowired
    //ReadProperties readProperties;

    //@Autowired
    WebDriver webDriver;

    public void setChromeDriver(){
        logger.info("####### SET UP CHROME DRIVER ######");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public void init() throws InterruptedException {
        logger.info("This is init in Webdriver session");
        String browserType="chrome";

        switch(browserType){
            case "chrome":
                setChromeDriver();
                break;
            default:
                System.out.println("#### No Browser Type provided #####");
        }

//  logger.info("Load the server url: " + readProperties.getServerUrl());
        webDriver.get("www.google.com");
    }

    public void quitDriver(){
        //webDriver.quit();
        logger.info("Close browser");
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
