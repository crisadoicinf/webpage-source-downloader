package com.crisado.webpagesourcedownloader;

import com.crisado.webpagesourcedownloader.config.WebDriverConfig;
import com.crisado.webpagesourcedownloader.service.WebPageSourceDownloaderService;

public class Application {

    public static void main(String[] args) {
        WebDriverConfig webDriverConfig = new WebDriverConfig();
        WebPageSourceDownloaderService sourceDownloader = new WebPageSourceDownloaderService(webDriverConfig.getChromeDriver());

        String url = args[0];
        String source = sourceDownloader.getSource(url);
        System.out.println(source);
    }

}
