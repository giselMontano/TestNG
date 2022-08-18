package com.syntax.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGannotation {
    //Writing down my first test case
    @Test//test annotation is used to indicate that this is a test case
    public void firstTestCase() {
        System.out.println("Heyy!! I am a first test case");
    }

    //Writing down another test case
    @Test(groups = "smoke")//for smoke xml
    public void secondTestCase() {
        System.out.println("Heyy!! I am a second  test case");
    }
    @Test//<--this annotation is a must
    public void thirdTestcase(){
        System.out.println("Heyy!! I am a third  test case");
    }
    @BeforeMethod//<--THIS IS ALWAYS EXECUTE BEFORE EACH AND EVERY @TEST CASES
    public void beforeMethod(){
        System.out.println("Hey!! I AM A BEFORE METHOD");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Hey!! I AM A AFTER METHOD");
    }
}

