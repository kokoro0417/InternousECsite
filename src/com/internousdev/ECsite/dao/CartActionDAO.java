package com.internousdev.ECsite.dao;

import java.sql.Connection;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;

public class CartActionDAO {



	public String CartIn(String user_id,String product_id){
		DateUtil datetime = new DateUtil();

		DBConnector db =new DBConnector();
		Connection con = db.getConnection();



		return "";
	}

}
