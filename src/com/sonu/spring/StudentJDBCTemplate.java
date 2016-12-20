package com.sonu.spring;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(Integer id, String name, Integer age) {
		String query = "insert into Student (id, name, age) values (?, ?, ?)";
		jdbcTemplateObject.update(query, id, name, age);
		System.out.println("Record created : Id = " + id + ", Name = " + name + ", Age = " + age);
		return;
	}

	public void delete(Integer id) {
		String query = "delete from Student where id = ?";
		jdbcTemplateObject.update(query, id);
		System.out.println("Record deleted with ID = " + id);
		return;
	}

	public void update(Student student) {
		String query = "update Student set age = ?, name = ? where id = ?";
		jdbcTemplateObject.update(query, student.getAge(), student.getName(), student.getId());
		System.out.println("Record updated  with ID = " + student.getId());
		return;
	}

	public Student getStudent(Integer id) {
		String query = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(query, new Object[] { id }, new StudentMapper());
		return student;
	}

	public List<Student> listStudents() {
		String query = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(query, new StudentMapper());
		return students;
	}

}