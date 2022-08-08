package org.example;

import org.example.pageObject.HomePage;
import org.example.pageObject.PaymentPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class SeleniumTest extends BaseTest {
    //Open web browser
    // Open URL https://demo.midtrans.com/
    @Test
    public void testMidtrans() throws InterruptedException {

        //Home Page
        HomePage homePage = new HomePage(webdriver);
        Assert.assertTrue(homePage.isDisplayed());
        String expectedHomeTitle = "Midtrans Pillow";
        Assert.assertEquals(expectedHomeTitle,homePage.getTitle());

        homePage.clickBuyNow();
        Thread.sleep(2000);
        homePage.fillFormCheckout("300000","Feny","feny1992@gmail.com","081809230200",
                "Jakarta Pusat","Jl Haji Sarmili","10210");

        //Payment Page
        PaymentPage paymentPage = new PaymentPage(webdriver);//Halama Utama
        webdriver = paymentPage.switchToFrame(); //Frame
        paymentPage = new PaymentPage(webdriver); // Halama Payment
        paymentPage.clickCreditCard(); //Select Payment method credit/debit card
        paymentPage.fillFormPaymentCreditCard("4811 1111 1111 1114", "0125", "123");


        //Shopping Cart
//        webdriver.findElement(By.xpath("//a[.='BUY NOW']")).click();
//        webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        webdriver.findElement(By.xpath("//input[@class='text-right']")).clear();
//        webdriver.findElement(By.xpath("//input[@class='text-right']")).sendKeys("150000");
//        webdriver.findElement(By.xpath("//input[@value='Budi']")).clear();
//        webdriver.findElement(By.xpath("//input[@value='Budi']")).sendKeys("Fina");
//        webdriver.findElement(By.xpath("//input[@value='budi@utomo.com']")).clear();
//        webdriver.findElement(By.xpath("//input[@value='budi@utomo.com']")).sendKeys("Fina1992@gmail.com");
//        webdriver.findElement(By.xpath("//input[@value='081808466410']")).clear();
//        webdriver.findElement(By.xpath("//input[@value='081808466410']")).sendKeys("081809222888");
//        webdriver.findElement(By.xpath("//input[@value='Jakarta']")).clear();
//        webdriver.findElement(By.xpath("//input[@value='Jakarta']")).sendKeys("Jakarta Pusat");
//        webdriver.findElement(By.xpath("//textarea[.='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")).clear();
//        webdriver.findElement(By.xpath("//textarea[.='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")).sendKeys("Jl. H Sarmili I No.12");
//        webdriver.findElement(By.xpath("//input[@value='10220']")).clear();
//        webdriver.findElement(By.xpath("//input[@value='10220']")).sendKeys("10210");
//        webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        webdriver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
//        webdriver.switchTo().frame(webdriver.findElement(By.xpath("//iframe[@id='snap-midtrans']")));
//        webdriver.findElement(By.xpath("//nav[@id='header']/div[2]/div/div/div[4]/div/img")).click();
//        webdriver.findElement(By.xpath("//div[@id='application']/div/div/div/div/div/div/div[4]/div/img")).click();
//        webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        //Payment by Credit card
//        webdriver.findElement(By.xpath("//div[@id='application']/div/a/div[2]")).click();
//        webdriver.findElement(By.xpath("//div[@class='card-number-input-container']/input[@class='valid-input-value']")).sendKeys("4811111111111114");
//        webdriver.findElement(By.xpath("//input[@id='card-expiry']")).sendKeys("0125");
//        webdriver.findElement(By.xpath("//input[@id='card-cvv']")).sendKeys("123");
//        //Discount
//        webdriver.findElement(By.xpath("//div[@id='application']/div/div[5]/div[8]/div/span/label")).click();
//        webdriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//        //Button Paynow
//        webdriver.findElement(By.xpath("//button[@type='button']")).click();
//        webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Frame Issuing Bank
//        webdriver.switchTo().defaultContent();
//        webdriver.switchTo().frame(webdriver.findElement(By.xpath("//iframe[@id='snap-midtrans']")));
//        webdriver.switchTo().frame(webdriver.findElement(By.xpath("//iframe[@title='3ds-iframe']")));
//        webdriver.findElement(By.xpath("//input[@id='PaRes']")).click();
//        webdriver.findElement(By.xpath("//input[@id='PaRes']")).sendKeys("112233");
//        webdriver.findElement(By.xpath("//button[@name='ok']")).click();
//        webdriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }
}

