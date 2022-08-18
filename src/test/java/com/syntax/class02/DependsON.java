package com.syntax.class02;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsON {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("I am before suit");
    }
    @Test
    public void login(){
        System.out.println("I have logged in successfully");
//       just to fail the test case for the example
        System.out.println(0/0);
    }

    @Test(dependsOnMethods = "login")//this gets skip because it dependents  of login() and login has failed
    public  void verificationOfDashBoardPage(){

        System.out.println("I am on dashboard page");

    }
}






