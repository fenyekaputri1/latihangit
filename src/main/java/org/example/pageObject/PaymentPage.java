package org.example.pageObject;

import org.example.helper.PaymentHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends PaymentHelper {

    WebDriver driver;

    By iframeOuter = By.xpath("//iframe[@id='snap-midtrans']");
    By buttonCreditCard = By.xpath("//div[@id='application']/div/a/div/div[2]");


    //Payment Credit Card
    By inputCardNumber = By.xpath("//div[@class='card-number-input-container']/input[@class='valid-input-value']");
    By inputExpirationDate = By.xpath("//input[@id='card-expiry']");
    By inputCCV = By.xpath("//input[@id='card-cvv']");
    By buttonPayNow = By.xpath("//button[@type='button']");

    public PaymentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver switchToFrame(){
        return driver.switchTo().frame(driver.findElement(iframeOuter));
    }

    public void clickCreditCard(){
        driver.findElement(buttonCreditCard).click();
    }

    public void fillFormPaymentCreditCard(String cardNumber, String cardExpiry, String cVV ){
        setText(inputCardNumber, cardNumber);
        setText(inputExpirationDate, cardExpiry);
        setText(inputCCV, cVV);
        driver.findElement(buttonPayNow).click();
    }


}
