package com.w3cjava.rmi.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext ctx=null;
	public static void main( String[] args ) throws InterruptedException{
    	 ctx = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    	 Object lock = new Object();  
         synchronized (lock) {
             lock.wait();
         }
    }
}
