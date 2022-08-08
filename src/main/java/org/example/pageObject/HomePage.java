package org.example.pageObject;

import org.example.helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumHelper {

    //Class
    WebDriver driver;

    //Variabel untuk element
    By title = By.xpath("//div[@class='title']");
    By buttonBuyNow = By.xpath("//a[.='BUY NOW']");

    //Form Shopping Cart
    By inputAmount = By.xpath("//input[@class='text-right']");
    By inputName = By.xpath("//td[.='Name']/following-sibling::td/input");
    By inputEmail = By.xpath("//td[.='Email']/following-sibling::td/input");
    By inputPhoneNumber = By.xpath("//td[.='Phone no']/following-sibling::td/input");
    By inputCity = By.xpath("//td[.='City']/following-sibling::td/input");
    By inputAddress = By.xpath("//td[.='Address']/following-sibling::td/textarea");
    By inputPostalCode = By.xpath("//td[.='Postal Code']/following-sibling::td/input");
    By buttonCheckout = By.xpath("//div[@class='cart-checkout']");


    //Contructor Webdriver
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Method untuk memverify element dari Class SeleniumTest
    public boolean isDisplayed(){
        return driver.findElement(title).isDisplayed();
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }

    public void clickBuyNow(){
        driver.findElement(buttonBuyNow).click();
    }

    public void fillFormCheckout(String amount,
                                 String name, String email, String phoneNumber, String city,String address,
                                 String postalCode){
        setText(inputAmount, amount);
        setText(inputName, name);
        setText(inputEmail, email);
        setText(inputPhoneNumber, phoneNumber);
        setText(inputCity, city);
        setText(inputAddress, address);
        setText(inputPostalCode, postalCode);
        driver.findElement(buttonCheckout).click();
    }


}
