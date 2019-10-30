package com.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class testapplication {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context =
	            new ClassPathXmlApplicationContext(
	                    "beans.xml");
		BeanFactory f=(BeanFactory)context;
		MyBean bean=(MyBean)f.getBean("MyBean");
		System.out.println(bean);
	}
}
