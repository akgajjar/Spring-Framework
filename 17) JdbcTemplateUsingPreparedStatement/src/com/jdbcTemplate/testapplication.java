package com.jdbcTemplate;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testapplication {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");

		studentDao dao = (studentDao) c.getBean("Studentdao");

		student s = new student(1, "Aniket", "Gajjar");
		System.out.println("Insert Student : ");

		System.out.println("Data" + s + " Affected Rows : " + dao.savestudent(s));
		System.out.println();
		s = new student(2, "Yesha", "Gajjar");
		System.out.println("Data" + s + " Affected Rows : " + dao.savestudent(s));
		System.out.println();
		s = new student(3, "Prachi", "Jain");
		System.out.println("Data" + s + " Affected Rows : " + dao.savestudent(s));
		System.out.println();
		s = new student(4, "JayDeep", "Warrier");
		System.out.println("Data" + s + " Affected Rows : " + dao.savestudent(s));
		System.out.println();

		s = new student(1, "Yesha", "Gajjar");
		System.out.println("Update Student : ");
		System.out.println("Data" + s + " Affected Rows : " + dao.updatestudent(s));

		System.out.println();

		System.out.println("Del Student : ");

		System.out.println("id" + 1 + " Affected Rows : " + dao.deletestudent(1));

		System.out.println();

		/*
		 * System.out.println("Get  Student By Id : ");
		 * 
		 * List<Map<String, Object>> list = dao.getstudent(2);
		 * 
		 * for (Map<String, Object> map : list) { System.out.println(map); }
		 * 
		 * System.out.println(); System.out.println("Get  Student By Id : ");
		 * 
		 * list = dao.getstudent();
		 * 
		 * for (Map<String, Object> map : list) { System.out.println(map); }
		 */
	}
}
