package com.tcet.test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcet.Dao.StudentDao;
import com.tcet.Model.Student;

public class StudentTestCase 
{
	static StudentDao studentdao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext = new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com");
		annotationConfigAppContext.refresh();
		
		studentdao = (StudentDao)annotationConfigAppContext.getBean("studentDao");
		//below line put in comment
		//annotationConfigAppContext.close();
	}
	
	@Test
	public void testAddingStudent()
	{
		//SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
		
		Student student = new Student();
		student.setRollNo(1);
		student.setStudentName("Kirtan");
		student.setMobile(952468954);
		student.setEmail("kirtan@gmail.com");
		student.setBranch("Information Technology");
		student.setGender("Male");
		//student.getStudentDOB(date.parse(null));
		student.getStudentDOB();
		student.setAcademicYear("2017-2018");
		student.setDivision("B");
		
		assertTrue("Error saving Student Details", studentdao.insertStudentDetail(student));
	}
}
