package com.syntax.class02;

import org.testng.annotations.Test;

public class Priority {

    @Test(groups = "smoke")
    public void FirstTest() {
        System.out.println("hello! 1st test PriorityClass");

    }

    @Test
    public void SecondTest() {

        System.out.println("hello! 2nd test PriorityClass");
    }

    @Test(priority = 2)
    public void ThirdTest() {

        System.out.println("hello! 3rd test PriorityClass");
    }

    @Test(priority = 1)
    public void FourthTest() {
        System.out.println("hello! 4th test PriorityClass");
    }

}
