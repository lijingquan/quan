package com.quan.rpc.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionServiceMock implements TransactionService {

	private final static Logger LOGGER = LoggerFactory.getLogger(DubboServiceMock.class);

	@Override
	public String save() {
		LOGGER.info("DubboServiceMock => say");

		return null;
	}


}
