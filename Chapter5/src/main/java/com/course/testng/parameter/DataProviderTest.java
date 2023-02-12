package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public  void testDataProvider(String name ,int age){
        System.out.println("name = "+ name+", age = "+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"ZHANGSAN", 10},
                {"LISE", 14},
                {"WANGWU", 17}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法的name="+name+", ag===e"+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test22222方法的name="+name+", age==="+age+"2222222");
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"LiLI",40},
                    {"GG",90},
                    {"contd",33},
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"小明",29},
                    {"西西",30}
            };
        }
        return result;
    }
}
