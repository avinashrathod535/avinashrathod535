package com.withCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("withCollection.cfg.xml");
		Question ob = (Question) ctx.getBean("q1");
		//System.out.println(ob);
		ob.displayInfo();

	}
}
