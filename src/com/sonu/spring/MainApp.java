package com.sonu.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		/*
		 * Before running this program, create a table in MYSQL in database with
		 * name "springtest" using below query
		 * CREATE TABLE Student(
		 * 		ID INT NOT NULL,
		 * 		NAME VARCHAR(20) NOT NULL,
		 * 		AGE INT NOT NULL,
		 * 		PRIMARY KEY (ID)
		 * );
		 */

		/*
		 * Before running this program, create a table in MYSQL in database with
		 * name "springtest" using below query
		 * CREATE TABLE Score(
		 * 		STUDENT_ID INT NOT NULL,
		 * 		MARKS INT NOT NULL,
		 * 		PRIMARY KEY (STUDENT_ID)
		 * );
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

		System.out.println("\nCreatiing records--------");
		studentJDBCTemplate.create(1, "Sonu", 24, 90);
		studentJDBCTemplate.create(2, "Gaurav", 23, 95);
		studentJDBCTemplate.create(3, "Madhuri", 25, 100);

		System.out.println("\nListing records--------");
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Age : " + record.getAge());
			System.out.println(", Marks : " + record.getMarks());
		}
	}
}