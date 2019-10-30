package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		boolean s =dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));
			
		if(!s)
		{
			System.out.println("Employee Inserted Sucessfully!!!!!!!!!!");
		}
		else
		{
			System.out.println("Employee Is Not Inserted Sucessfully!!!!!!!!!!!");
		}
		
	}

}
