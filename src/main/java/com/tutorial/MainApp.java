package com.tutorial;

import helloTest.HHelloSpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
     @SuppressWarnings("resource")
	ApplicationContext context = 
             new ClassPathXmlApplicationContext("beans.xml");

      HelloSpring obj = (HelloSpring) context.getBean("hellospringji");
      //System.out.println(obj);
      
      
      
      obj.getMessage();
   }
}