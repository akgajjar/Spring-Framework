package com.springframework.Mainclasses;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.bean.Question;

public class testapplication {

	
	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Question e=(Question)c.getBean("question");
		System.out.println(e);
	}
}
