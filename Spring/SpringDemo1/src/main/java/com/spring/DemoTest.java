package com.spring;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    /**
     * 调用sayHello的方法
     * @param args
     */
    public static void main(String[] args) {

        //原始方法
//        UserInfo user=new UserInfo();
//        user.setName("Lily");
//        String result=user.sayHello();
//        System.out.println(result);

      //Spring方法
        //1.拿到Spring容器
        //从Spring的容器中获取一个叫applicationContext.xml的文件。拿到该文件就相当于拿到了Spring的容器
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取对象:通过对象id拿到对象，返回的是包名加类名
        //getBean返回的是一个Object对象所以要进行强制类型转换
        UserInfo userInfo=(UserInfo) context.getBean("userInfo");
        String result=userInfo.sayHello();
        System.out.println(result);
    }
}
