package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedExecption {
    /**
     *
     */
@Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
        //输出要放在抛出异常前面


    }
}
