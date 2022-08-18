package com.syntax.class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertions {
    //navigate to syntaxhrms
    //we need to write to case to verify
    //quit the browser

    WebDriver driver;
    //    navigate to syntax HRMS website
    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }

    @Test(groups = "smoke")
    public void verifyInvalidCredentialsError() {
//finding the username text box
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//send username
        username.sendKeys("WeatherMay");
//finding the password field
        WebElement pswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//send password
        pswrd.sendKeys("abcdefgh");
//finding the element login btn
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//click the login
        loginBtn.click();

        //get the element message invalid credentials
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        //extract the error message
        String errorText = errorMsg.getText();
        System.out.println(errorText);

        //not the best approach
        /*if(errorText.equals(("Invalid credential"))){
            System.out.println("Test case has passed");
        }else{
            System.out.println("Test case has failed");
        }*/
//USE ASSERTION CLASS FROM TESTNG, INSTEAD OF IF ELSE CONDITION
        //declaring the message that we are expecting
        String expectedMsg = "Invalid credentials";

        //making assertion to compare the message from the web with the string we are expecting above, errorText LINE 44
        Assert.assertEquals(errorText, expectedMsg);

        //"steal exception" is due refreshing after entering username and password DOM gets refresh
        //re-assigning the username because the page is refreshed, and we get a "stale element exception"
        username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        //Get the text box Username is displayed
        boolean displayed = username.isDisplayed();
        //System.out.println(displayed);

        //Check if the displayed is true or not, instead of sout
        Assert.assertTrue(displayed);

    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}