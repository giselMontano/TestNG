package com.syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnoatationExample {
    //go to facebook.com
    //make sure the text Connect with friends and the world... is there
    public static WebDriver driver;//<-- in order to use the driver throwout the whole code we need to declare a static variable
    @Test
    public void testingForfbText() {//this gets execute 2nd because it starts with the letter t alphabetic execution

        String text = driver.findElement(By.xpath("//h2")).getText();
        //IN TESTNG WE DO NOT USE IF CONDITION SINCE "IF CONDITION" DOES NOT DETERMINATE IF THE TEST IS CORRECT OR WRONG
        if (text.equals("Connect with friends and the world around you on Facebook.")) {
            System.out.println("succesfull");
        } else {
            System.out.println("failed");
        }

    }
    //goto fb.com
    //make sure create account text is there

    @Test
    public void createAccountText() {//this gets execute 1nd because it starts with the letter c alphabetic execution

        String text = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();

        if (text.equals("Create new account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");

        }

    }
    @BeforeMethod//<-- this is executed before every and each test cases
    public void settingUpBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();//<--you can not declare Web-driver again here because it is a instance variable already
        //getting the particular url
        driver.get("https://fb.com");

    }

    @AfterMethod
    public void quittingTheBrowser() {
        driver.quit();
    }

}



