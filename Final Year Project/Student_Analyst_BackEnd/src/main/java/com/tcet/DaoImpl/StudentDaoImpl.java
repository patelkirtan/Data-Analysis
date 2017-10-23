package com.tcet.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcet.Dao.StudentDao;
import com.tcet.Model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao 
{
	@Autowired
	SessionFactory sessionfactory;
	
	public StudentDaoImpl(SessionFactory sessionfactory)
	{
		this.sessionfactory = sessionfactory;
	}
	
	@Transactional
	public boolean insertStudentDetail(Student student) 
	{
		try
		{
			System.out.println("Saving Student Detail....................................");
			sessionfactory.getCurrentSession().saveOrUpdate(student);
			return true;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return false;
		}
	}

}
