package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass22中的stu1运行111111111111111");
    }

    public void stu2(){
        System.out.println("GroupsOnClass222中的stu2运行222222222222222");
    }
}
