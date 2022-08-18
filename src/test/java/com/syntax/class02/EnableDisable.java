package com.syntax.class02;

import org.testng.annotations.Test;

public class EnableDisable {

        @Test(enabled = false)//THIS TEST WILL NOT RUN BECAUSE IT HAS THE TAG (enabled = false)
        public void FirstTest(){
            System.out.println("hello! 1st test EnableDisableClass");

        }
        @Test
        public void SecondTest(){

            System.out.println("hello! 2nd test EnableDisableClass");
        }

        @Test(groups = "smoke")
        public void ThirdTest(){

            System.out.println("hello! 3rd test EnableDisableClass");
        }
    }

