package com.syntax.class03;

import org.testng.annotations.*;

public class Annotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am a before Suite");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("I am after suit");
    }
    // this annotation will execute before test  that contain this annotation <test></test> in xml once for all the test that are inside
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before Test");
    }
    //execute ONCE before the class
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @Test
    public void Atest(){
        System.out.println("I am  Atest");
    }
    @Test
    public void Btest(){
        System.out.println("I am Btest");
    }
    //execute ONCE after the class
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @AfterTest
    public void afterTest(){

        System.out.println("I am after Test");
    }

}
