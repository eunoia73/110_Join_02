package com.portfolio.www.service;

import java.util.HashMap;

import com.portfolio.www.dao.JoinDao;

public class JoinService {

	private JoinDao joinDao;
	
	public void setJoinDao(JoinDao joinDao) {
		System.out.println("\n\n joinDao: "+joinDao);
		this.joinDao = joinDao;
	}
	
	public int join(HashMap<String,String> params) {
			
		System.out.println("=====params"+params);
		
		return joinDao.join(params);
	}
	
	
}
