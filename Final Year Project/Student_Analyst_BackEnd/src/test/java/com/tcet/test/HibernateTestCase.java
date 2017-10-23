package com.tcet.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HibernateTestCase 
{
	@Test
	public void Initailize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext = new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com");
		annotationConfigAppContext.refresh();
		assertTrue("Initialization Problem...........................",true);
		//below line put in comment
		annotationConfigAppContext.close();
	}
}
