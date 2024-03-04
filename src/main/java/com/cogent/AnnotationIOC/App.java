package com.cogent.AnnotationIOC;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new AnnotationConfigApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Product product = (Product)context.getBean("product");
        System.out.println(product.getName());
        System.out.println(product.getBrand().getName());
        
        //HOMEWORK--------------------------------------------------------------------
        System.out.println(product.getId());
        System.out.println(product.getPrice());
        System.out.println(Arrays.toString(product.getRams()));
        
        
    	//----------------------------------------------------------------------------

    }
}
