package com.venkatesh.Servlet;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.venkatesh.booksdao.booksdao;


@WebServlet("/book")
public class Servlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) {
	
		try {
			int id=Integer.parseInt(req.getParameter("bookid"));
		String name=req.getParameter("bookname");
		
		double price=Double.parseDouble(req.getParameter("bookprice"));
		booksdao book=new booksdao();
		boolean  status=book.book(id, name,price);
		PrintWriter pw=resp.getWriter();
		String response=null;
		if(status) {
			response= "data inserted";
		}
		else
			response= " failed to data inserted";
		pw.append(response);
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	
	}


}
