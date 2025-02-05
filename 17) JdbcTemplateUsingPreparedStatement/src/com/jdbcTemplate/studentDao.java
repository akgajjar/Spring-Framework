package com.jdbcTemplate;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;  
public class studentDao implements Serializable {
	
	private transient JdbcTemplate jdbctemplate;
	
	

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public int  savestudent(student student)
	{
		String query="insert into student(fname,lname)values(?,?)";
		return jdbctemplate.update(query,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean  doInPreparedStatement(PreparedStatement p) throws SQLException, DataAccessException {
				p.setString(1, student.getFname());
				p.setString(2, student.getLname());
				
				return p.execute();
			}
			
		});
	}

	public int deletestudent(int id)
	{
		String query="delete from student where id = ?";
		return jdbctemplate.update(query,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement p) throws SQLException, DataAccessException {
				p.setInt(1, id);
				
				return p.execute();
			}
			
		});
	}
	public int updatestudent(student student)
	{
		String query="update student set fname = ?,lname=? where id =?";
		return jdbctemplate.update(query,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement p) throws SQLException, DataAccessException {
				p.setString(1, student.getFname());
				p.setString(2, student.getLname());
				p.setInt(3, student.getId());
				
				return p.execute();
			
		
			}
			
		});
	}
	public List<Map<String, Object>> getstudent(int id)
	{
		String query="select * from student where id = ";
		List<Map<String, Object>> retList =jdbctemplate.queryForList(query);
		return retList;
	}

	public List<Map<String, Object>> getstudent() {
		String query="select * from student ";
		List<Map<String, Object>> retList =jdbctemplate.queryForList(query);
		return retList;
	}
}
