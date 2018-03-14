package com.quan.rpc.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * ½µ¼¶DubboService·şÎñ
 *
 */
public class DubboServiceMock implements DubboService {

	 private final static Logger LOGGER = LoggerFactory.getLogger(DubboServiceMock.class);
	
	
	@Override
	public String say() {
		
		LOGGER.info("DubboServiceMock => say");
		
		return null;
	}

}
