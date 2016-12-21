package com.sonu.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(Integer id, String name, Integer age, Integer marks) {

		try {
			String query = "insert into Student (id, name, age) values (?, ?, ?)";
			jdbcTemplateObject.update(query, id, name, age);
			System.out.println("Record created in Student : Id = " + id + ", Name = " + name + ", Age = " + age);

			query = "insert into Score (student_id, marks) values (?, ?)";
			jdbcTemplateObject.update(query, id, marks);
			System.out.println("Record created in Score: Id = " + id + ", Marks = " + marks);

		} catch (DataAccessException ex) {
			System.out.println("Error in creating record, rolling back");
			throw ex;
		}
		return;
	}

	public List<Student> listStudents() {
		String query = "select * from Student, Score where Student.id = Score.student_id";
		List<Student> students = jdbcTemplateObject.query(query, new StudentMapper());
		return students;
	}
}