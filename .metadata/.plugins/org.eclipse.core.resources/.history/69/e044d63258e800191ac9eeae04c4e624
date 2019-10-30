package com.springframework.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.student;

public class studentdao {

	@Autowired
	private SessionFactory template;
	
	//method to save student  
	public void saveStudent(student e){  
	    template.getCurrentSession().save(e);  
	}  
	//method to update student  
	public void updateStudent(student e){  
	    template.getCurrentSession().update(e);  
	}  
	//method to delete student  
	public void deleteStudent(student e){  
	    template.getCurrentSession().delete(e);  
	}  
	//method to return one student of given id  
	public student getById(int id){  
		student e=(student)template.getCurrentSession().get(student.class,id);  
	    return e;  
	}  
	//method to return all students  
	public List<student> getStudents(){  
		return template.getCurrentSession().createQuery("from Student").list();
		
	}  
}
