package com.quan.rpc;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuanRpcServiceApplication {

	private final static Logger LOGGER = Logger.getLogger(QuanRpcServiceApplication.class);

   
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		LOGGER.info(">>>>> quan-rpc-service 正在启动 <<<<<");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		
		context.start();
		
		LOGGER.info(">>>>> quan-rpc-service 启动完成 <<<<<");
		
		System.in.read();

		
	}

}
