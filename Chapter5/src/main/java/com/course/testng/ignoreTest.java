package com.course.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignore1(){
        System.out.println("IGORE 1 执行！");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 ");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("INGORE3");
    }
}
