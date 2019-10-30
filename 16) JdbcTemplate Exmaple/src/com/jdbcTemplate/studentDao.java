package com.jdbcTemplate;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;  
public class studentDao {
	
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public int savestudent(student student)
	{
		String query="insert into student(fname,lname)values('"+student.getFname()+"','"+student.getLname()+"')";
		return jdbctemplate.update(query);
	}

	public int deletestudent(int id)
	{
		String query="delete from student where id = "+id;
		return jdbctemplate.update(query);
	}
	public int updatestudent(student student)
	{
		String query="update student set fname = '"+student.getFname()+"',lname='"+student.getLname()+"' where id = "+student.getId();
		return jdbctemplate.update(query);
	}
	public List<Map<String, Object>> getstudent(int id)
	{
		String query="select * from student where id = "+id;
		List<Map<String, Object>> retList =jdbctemplate.queryForList(query);
		return retList;
	}

	public List<Map<String, Object>> getstudent() {
		String query="select * from student ";
		List<Map<String, Object>> retList =jdbctemplate.queryForList(query);
		return retList;
	}
}
