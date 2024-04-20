package com.portfolio.www.dao;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JoinDao extends JdbcTemplate{

	public JoinDao() {}
	public JoinDao(DataSource datasource) {
		super(datasource);
		System.out.println("\n\n"+datasource);
	}
	
	public int join(HashMap<String, String>params) {
		
		String sql="INSERT INTO forum.`member` "
				+ "(member_id, passwd, member_nm, email, pwd_chng_dtm, join_dtm) "
				+ "VALUES('', '"+params.get("passwd")
				+ "', '"+params.get("memberNm1")+params.get("memberNm2")
				+ "', '"+params.get("email")
				+ "', DATE_FORMAT(NOW(), '%Y%m%d%H%i%s'), DATE_FORMAT(NOW(), '%Y%m%d%H%i%s'))";
		
		
		return update(sql);
	}
}
