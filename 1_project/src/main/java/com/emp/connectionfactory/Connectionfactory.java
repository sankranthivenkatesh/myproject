package com.emp.connectionfactory;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Connectionfactory {

	private static DataSource ds=null;
	public static Connection getConnection() throws Exception {
		if(ds==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 FileInputStream fs=new FileInputStream(new File("C:\\corejava\\1_project\\db.properties"));
            Properties p=new Properties();
            p.load(fs);
      String uname=p.getProperty("db.username");
      String url=p.getProperty("db.url");
      String pwd=p.getProperty("db.password");
      String driver=p.getProperty("db.driver");
    	HikariConfig config=new HikariConfig();
    	config.setUsername(uname);
    	config.setJdbcUrl(url);
    	config.setPassword(pwd);
    	config.setDriverClassName(driver);
    
          ds =new HikariDataSource(config);
		}
          Connection con=ds.getConnection();
		
    
    return  con;
	}
}
