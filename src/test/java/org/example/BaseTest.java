package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class  BaseTest {
    //Class ini untuk inisialisasi webdriver
    //Kegunaan membuat class BaseTest supaya tidak berulang ulang menginisialisasikan webdriver
    WebDriver webdriver;

    @Before
    public void OpenWebBrowser(){
        System.out.println("Before test");
        //lokasi web driver
        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
        webdriver = new ChromeDriver();

        //URL midtrans
        //webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        webdriver.get("https://demo.midtrans.com/");
        webdriver.manage().window().maximize();
    }

    //Untuk menutup browser setelah semua test di jalankan
//    @After
//    public void closeWebBrowser(){
//        webdriver.quit();
//    }

}

