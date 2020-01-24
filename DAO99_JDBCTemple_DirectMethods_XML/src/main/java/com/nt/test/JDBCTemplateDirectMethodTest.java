package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.EmployeeManagementServiceImpl;

public class JDBCTemplateDirectMethodTest {

	public static void main(String[] args) {
		//Create IOC Container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		try {
			//get Service Bean
			EmployeeManagementServiceImpl service=ctx.getBean("service",EmployeeManagementServiceImpl.class);

			//call b method
			System.out.println("Employee Count:: "+service.fetchEmployeeCount());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
			System.out.println(dae.getMessage());
		}
	}

}
