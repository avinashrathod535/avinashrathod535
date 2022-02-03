package com.pathlock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		// eager loading
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		Student ob=(Student) ctx.getBean("s1");
		System.out.println(ob);

		//Student ob1=(Student) ctx.getBean("c1");
		//System.out.println(ob1);
		
		
		/*Student ob1=(Student) ctx.getBean("s2");
		System.out.println(ob1);*/
		
		

		
	}
}
