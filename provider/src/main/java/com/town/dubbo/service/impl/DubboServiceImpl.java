package com.town.dubbo.service.impl;

import com.town.dubbo.service.IDubboService;


public class DubboServiceImpl implements IDubboService{

	@Override
	public void test1() {
		System.out.println("provider中的service中的方法被调用了============");
	}

}
