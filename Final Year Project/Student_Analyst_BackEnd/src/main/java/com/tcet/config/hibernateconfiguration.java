package com.tcet.Student_Analyst.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tcet.Student_Analyst.Dao.StudentDao;
import com.tcet.Student_Analyst.Dao.TeacherDao;
import com.tcet.Student_Analyst.DaoImpl.StudentDaoImpl;
import com.tcet.Student_Analyst.DaoImpl.TeacherDaoImpl;
import com.tcet.Student_Analyst.Model.Student;
import com.tcet.Student_Analyst.Model.Teacher;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class hibernateconfiguration 
{
	@Autowired
	@Bean(name="DataSource")
	public DataSource getH2DataSource()
	{
		System.out.println("Initializing & Connecting DataBase to H2............................");
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/student");
		datasource.setUsername("student_analysis");
		datasource.setPassword("user");
		System.out.println("Connection Successful..................................");
		return datasource;
	}
	
	private Properties getHibernateProperties()
	{
		System.out.println("Creating Hibernate Properties...................................");
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto","update");
		properties.put("hibernate.show_sql","true");
		System.out.println("Hibernate Properties are Created...............................");
		return properties;
	}
	
	@Autowired
	@Bean(name="SessionFactory")
	public SessionFactory getSessionFactory(DataSource datasource)
	{
		System.out.println("Creating Session Factory.......................................");
		LocalSessionFactoryBuilder session = new LocalSessionFactoryBuilder(datasource);
		session.addProperties(getHibernateProperties());
		session.addAnnotatedClass(Student.class);
		session.addAnnotatedClass(Teacher.class);
		System.out.println("Session Factory is Created......................................");
		return session.buildSessionFactory();
	}
	
	//Add the CRUD Method here
	@Autowired
	@Bean(name="studentDao")
	public StudentDao getStudentDao(SessionFactory sessionfactory)
	{
		System.out.println("Student Object Creating.....................................");
		return new StudentDaoImpl(sessionfactory);
	}
	
	@Autowired
	@Bean(name="teacherDao")
	public TeacherDao getTeacherDao(SessionFactory sessionfactory)
	{
		System.out.println("Teacher Object Creating.....................................");
		return new TeacherDaoImpl(sessionfactory);
	}
	
	@Autowired
	@Bean(name="TransactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionfactory)
	{
		System.out.println("Creating Transaction Manager...................................");
		HibernateTransactionManager transaction = new HibernateTransactionManager(sessionfactory);
		System.out.println("Transaction Manager is Created..............................................");
		return transaction;
	}
}
