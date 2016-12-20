package com.sonu.spring;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {

	public void setDataSource(DataSource ds);

	public void create(Integer id, String name, Integer age);

	public void delete(Integer id);

	public void update(Student student);

	public Student getStudent(Integer id);

	public List<Student> listStudents();

}