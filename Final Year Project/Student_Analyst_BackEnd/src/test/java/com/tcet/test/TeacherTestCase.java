package com.tcet.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcet.Dao.TeacherDao;
import com.tcet.Model.Teacher;

public class TeacherTestCase 
{
	static TeacherDao teacherdao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext = new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com");
		annotationConfigAppContext.refresh();
		
		teacherdao = (TeacherDao)annotationConfigAppContext.getBean("teacherDao");
		//below line put in comment
		//annotationConfigAppContext.close();
	}
	
	@Test
	public void testAddingTeacher()
	{
		Teacher teacher = new Teacher();
		teacher.setFacultyID(1);
		teacher.setTeacherName("Rahul");
		teacher.setEmail("Rahul123@gmail.com");
		teacher.setMobile(982459684);
		teacher.setGender("Male");
		teacher.setBranch("Information Technology");
		
		assertTrue("Error saving Teacher Details", teacherdao.insertTeacherDetail(teacher));
	}
}
