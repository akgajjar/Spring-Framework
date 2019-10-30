package com.springframework.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springframework.bin.employee;

public class employeedao   {

	@Autowired
	private SessionFactory template;

	
	//method to save employee  
	public void saveEmployee(employee e){  
	    template.getCurrentSession().save(e);  
	}  
	//method to update employee  
	public void updateEmployee(employee e){  
	    template.getCurrentSession().update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(employee e){  
	    template.getCurrentSession().delete(e);  
	}  
	//method to return one employee of given id  
	public employee getById(int id){  
	    employee e=(employee)template.getCurrentSession().get(employee.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<employee> getEmployees(){  
	    
	    return template.getCurrentSession().createQuery("from employee").list();
		
	}  
}
