package com.venkatesh.booksdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.venkatesh.connectionfact.connectionfact;


public class booksdao {

	final String insert_sql="insert into books values(?,?,?)";
   public boolean book(int bookid,String bookname, double bookprice)throws Exception {
	   Connection con=connectionfact.getConnection();
	   
	   PreparedStatement ps= con.prepareStatement(insert_sql);
	   ps.setInt(1, bookid);
	   ps.setString(2, bookname);
	   ps.setDouble(3, bookprice);
	 int count=  ps.executeUpdate();
	 con.close();
	   return count > 0;
   }

}
