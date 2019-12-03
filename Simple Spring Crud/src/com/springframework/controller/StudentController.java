package com.springframework.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springframework.bin.student;
import com.springframework.dao.studentdao;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Resource r = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		studentdao sdao = (studentdao) factory.getBean("studao");
		HttpSession session = request.getSession();

		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("addstudent")) {

			student s = new student();

			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));

			sdao.saveStudent(s);

			
			student s1= sdao.getByname(s.getFname(), s.getLname());
			System.out.println("id "+s1.getId()+" fname "+s1.getLname()+" lname "+s1.getLname());
			List<student> students = sdao.getStudents();

			session.setAttribute("students", students);
			request.getRequestDispatcher("showallstudents.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("update")) {
			int id = Integer.parseInt(request.getParameter("id"));

			session.setAttribute("student", sdao.getById(id));

			request.getRequestDispatcher("update.jsp").forward(request, response);

		} else if (action.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			sdao.deleteStudent(sdao.getById(id));
			List<student> students = sdao.getStudents();

			session.setAttribute("students", students);

			response.sendRedirect("showallstudents.jsp");

		}
		if (action.equalsIgnoreCase("updatestudent")) {

			student s = new student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));

			sdao.updateStudent(s);;

			List<student> students = sdao.getStudents();

			session.setAttribute("students", students);
			request.getRequestDispatcher("showallstudents.jsp").forward(request, response);
		}
	}

}
