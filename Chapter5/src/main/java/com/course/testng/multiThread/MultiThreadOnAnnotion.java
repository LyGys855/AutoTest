package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 3,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Tread Id: %s%n",Thread.currentThread().getId());
    }
}
