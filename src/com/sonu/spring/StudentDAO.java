package com.sonu.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.transaction.PlatformTransactionManager;

public interface StudentDAO {

	public void setDataSource(DataSource ds);

	public void setTransactionManager(PlatformTransactionManager transactionManager);

	public void create(Integer id, String name, Integer age, Integer marks);

	public List<Student> listStudents();

}