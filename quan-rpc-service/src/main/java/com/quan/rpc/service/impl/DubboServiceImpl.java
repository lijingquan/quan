package com.quan.rpc.service.impl;

import com.quan.rpc.api.DubboService;

public class DubboServiceImpl implements DubboService{

	@Override
	public String say() {
		
		System.out.println("hello world");
		
		return "success";
	}

}
