package com.springframework.Mainclasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springframework.bean.Employee;

public class testapplication {

	
	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e=(Employee)c.getBean("byname");
		System.out.println("Autowiring By Name : ");
		System.out.println(e);
		System.out.println();
		
		 e=(Employee)c.getBean("bytype");
		System.out.println("Autowiring By Type : ");
		System.out.println(e);
		System.out.println();
		
		 e=(Employee)c.getBean("byconstructor");
		System.out.println("Autowiring By Constructor : ");
		System.out.println(e);
		System.out.println();
		
	}
}
