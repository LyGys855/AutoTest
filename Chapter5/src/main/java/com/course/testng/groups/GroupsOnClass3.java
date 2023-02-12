package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tch1(){
        System.out.println("GroupsOnClass3333333333333中的tch1运行111111111111111");
    }

    public void tch2(){
        System.out.println("GroupsOnClass33333333333中的tch2运行222222222222222");
    }
}
