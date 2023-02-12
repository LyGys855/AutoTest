package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2++======");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3333====");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444====");
    }
    @BeforeGroups("client")
    public void BeforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前执行的方法AAAAAAAAAAAAAAAAAAA");
    }
    @AfterGroups("client")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后执行的方法BBBBBBBBBBBBBBBBBBBBBBBB");
    }




}
