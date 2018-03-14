package com.quan.rpc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quan.dao.mapper.mysql.EmployeesMapper;
import com.quan.dao.mapper.oracle.PersonMapper;
import com.quan.dao.model.Employees;
import com.quan.dao.model.Person;
import com.quan.rpc.api.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private EmployeesMapper employeesMapper;
	
	@Autowired
	private PersonMapper personMapper;
	
	@Transactional
	public String save() {
		
		Employees e = new Employees();
		e.setDid(2);
		e.setEmpId(55555);
		e.setEmpName("test");
		
		
		employeesMapper.insert(e);
		
		Person p = new Person();
		
		p.setId(44444l);
		p.setName("test");
		
		personMapper.insert(p);
		
		
		
		return null;
	}

	
}
