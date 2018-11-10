package com.w3cjava.rmi.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.w3cjava.rmi.server.UserHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext ctx=null;

	public static void main( String[] args ){
		ctx = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		while(true){
			try {
				UserHandler handler = (UserHandler) ctx.getBean("getUserHandler");
				int count = handler.getUserCount();
				String name = handler.getUserName(1);
				System.out.println("name: " + name);
				System.out.println("count: " + count);
				System.out.println("user: " + handler.getUserByName("cos"));
			} catch (Exception e) {
				System.out.println("EEE");
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
}
