package com.emp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.emp.connectionfactory.Connectionfactory;
import com.emp.dto.empdto;

public class EmpDao {
	private static String insert="insert into emp(ename,eemail,egender,edept,exp) values(?,?,?,?,?)";
	   public boolean insert(empdto edto) {
	   int count=0;
	   try {
	   Connection con=Connectionfactory.getConnection();
	   PreparedStatement ps=con.prepareStatement(insert);
	   ps.setString(1,edto.getEname());
	   ps.setString(2, edto.getEmail());
	
	   ps.setString(3, edto.getGender());
	   ps.setString(4, edto.getEmpdept());
	   ps.setInt(5, edto.getExperience());
	   count =ps.executeUpdate();
   }catch(Exception e) {
	   e.printStackTrace();
   }
	   return count>0;
	   
}
  public List<empdto> getdto(empdto empDto){ 
	  StringBuilder sql=new StringBuilder("select *from emp where 1=1");
	  List<empdto> ld=new ArrayList<>();
	  try {
		  if(empDto.getGender()!=null && !empDto.getGender().equals("")) {
			  sql.append("  and egender =? ");
		  }
		  if(empDto.getEmpdept()!=null && !empDto.getEmpdept().equals("")) {
			  sql.append("  and edept =? ");
		  }
		  if(empDto.getExperience()!=null) {
			  sql.append(" and exp =? ");
		  }
		  Connection con=Connectionfactory.getConnection();
		  PreparedStatement ps=con.prepareStatement(sql.toString());
		  int index=1;
		  if(empDto.getGender()!=null && !empDto.getGender().equals("")) {
			  ps.setString( index,empDto.getGender());
			  index++;
		  }
		  if(empDto.getEmpdept()!=null && !empDto.getEmpdept().equals("")) {
			  ps.setString( index,empDto.getEmpdept());
			  index++;
		  }
		  if(empDto.getExperience()!=null) {
			  ps.setInt( index,empDto.getExperience());
			  index++;
		  }
		  ResultSet rs=ps.executeQuery();
		  while(rs.next()) {
			 empdto emdto=new empdto(); 
			 emdto.setEid(rs.getInt(1));
			emdto.setEname(rs.getString(2));
			 
			 emdto.setGender(rs.getString(4));
			 
		 emdto.setEmpdept(rs.getString(5));
			 emdto.setExperience(rs.getInt(6));
			 ld.add(emdto);
		  }
		 
	  }catch(Exception e){  
		  e.printStackTrace();
	  }	  
	  return ld;
  }
}