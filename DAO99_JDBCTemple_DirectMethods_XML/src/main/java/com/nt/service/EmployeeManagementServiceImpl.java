package com.nt.service;

import com.nt.dao.EmployeeDAO;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {
	private EmployeeDAO dao;
	public EmployeeManagementServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public int fetchEmployeeCount() {
		int count;
		//use DAO
		count=dao.getEmployeeCount();
		return count;
	}

}
