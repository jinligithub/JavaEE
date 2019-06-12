package com.bit;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class springDemoTest {

    ApplicationContext context=null;

    //在测试之前需要做哪些事情
    @Before
    public void Test_init(){
        //拿到Spring容器
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    //在吃之中需要做哪些事情
    @Test
    public void Test_funtion(){
        MyCalculate myCalculate=(MyCalculate)context.getBean("myCaculate_id");
        IShape rectangle=(Rectangle) myCalculate.caclulate("rectangle");
        System.out.println(rectangle.area());
        System.out.println(rectangle.cycle());

    }


}
