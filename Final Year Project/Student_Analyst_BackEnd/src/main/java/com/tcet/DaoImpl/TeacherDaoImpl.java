package com.tcet.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcet.Dao.TeacherDao;
import com.tcet.Model.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao 
{
	@Autowired
	SessionFactory sessionfactory;
	
	public TeacherDaoImpl(SessionFactory sessionfactory)
	{
		this.sessionfactory = sessionfactory;
	}
	
	@Transactional
	public boolean insertTeacherDetail(Teacher teacher) 
	{
		try
		{
			System.out.println("Saving Teacher Detail....................................");
			sessionfactory.getCurrentSession().saveOrUpdate(teacher);
			return true;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return false;
		}
	}
}
