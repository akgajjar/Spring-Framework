package com.springframework.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springframework.bin.employee;
import com.springframework.bin.student;
import com.springframework.dao.employeedao;
import com.springframework.dao.studentdao;

public class testapplication {
	
	public static void main(String[] args) {
		
		
		try {
		Resource r=new ClassPathResource("beans.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		employeedao edao=(employeedao) factory.getBean("empdao");
		studentdao sdao=(studentdao) factory.getBean("studao");
		
		employee e = new employee();
		student s=new student();
		e.setId(101);
		e.setName("Aniket Gajjar");
		e.setSalary(50000);
		
		s.setFname("kalpana");
		s.setLname("Gajjar");
		
		System.out.println("Save Employee and Student : ");
		edao.saveEmployee(e);
		sdao.saveStudent(s);
		}
		catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
		}
		
		
		
	}

}
