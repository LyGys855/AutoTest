package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是在测试方法前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是在测试方法后运行的");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("======BeforeClass在类运行之前的的输出");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass在类运行之后的输出==========");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
