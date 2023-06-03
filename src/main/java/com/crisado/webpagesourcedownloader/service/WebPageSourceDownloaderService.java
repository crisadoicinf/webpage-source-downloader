package com.crisado.webpagesourcedownloader.service;

import org.openqa.selenium.WebDriver;

public class WebPageSourceDownloaderService {

    private final WebDriver driver;

    public WebPageSourceDownloaderService(WebDriver driver) {
        this.driver = driver;
    }

    public String getSource(String url) {
        System.out.println("Downloading url=" + url);
        driver.get(url);
        String source = driver.getPageSource();
        driver.quit();
        return source;
    }
}
