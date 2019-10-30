package com.javatpoint;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
public class EmpDao {
SimpleJdbcTemplate template;

public EmpDao(SimpleJdbcTemplate template) {
		this.template = template;
}
public int update (Emp e){
		/*
		 * String query="update employee set name=? where id=?";
		 */
		/*
		 * int h= template.update(query,e.getName(),e.getId());
		 */
String query="update employee set name=?,salary=? where id=?";
int h= template.update(query,e.getName(),e.getSalary(),e.getId());
System.out.println("Record Updated Sucessfully");
return h;
}

}
