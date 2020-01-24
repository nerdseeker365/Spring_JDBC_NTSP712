package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String getEmployeeCount="SELECT COUNT(*) FROM EMP";
	
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int getEmployeeCount() {
		int count;
		count=jt.queryForObject(getEmployeeCount,Integer.class);
		return count;
	}

}
