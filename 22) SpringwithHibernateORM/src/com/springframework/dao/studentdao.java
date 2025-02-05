package com.springframework.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.student;

public class studentdao {

	
	HibernateTemplate template;
	

	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	//method to save student  
	public void saveStudent(student e){  
	    template.save(e);  
	}  
	//method to update student  
	public void updateStudent(student e){  
	    template.update(e);  
	}  
	//method to delete student  
	public void deleteStudent(student e){  
	    template.delete(e);  
	}  
	//method to return one student of given id  
	public student getById(int id){  
		student e=(student)template.get(student.class,id);  
	    return e;  
	}  
	//method to return all students  
	public List<student> getStudents(){  
	    List<student> list=new ArrayList<student>();  
	    list=template.loadAll(student.class);  
	    return list;  
	}  
}
