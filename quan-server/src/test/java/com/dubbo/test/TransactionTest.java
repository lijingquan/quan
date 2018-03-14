package com.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.quan.rpc.api.TransactionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-dubbo-consumer.xml")
public class TransactionTest {

	@Autowired
	private TransactionService transactionService;
	
	@Test
	public void testTransaction(){
		transactionService.save();
	}
}
