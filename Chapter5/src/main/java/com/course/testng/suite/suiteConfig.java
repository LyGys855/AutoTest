package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行了=======");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了*********");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("aaaaaaaaaTest");
    }
}
