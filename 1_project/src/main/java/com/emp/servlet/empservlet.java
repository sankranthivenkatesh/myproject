package com.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.Dao.EmpDao;
import com.emp.dto.empdto;
@WebServlet("/in")
public class empservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		String name1=req.getParameter("name1");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String dept=req.getParameter("dept");
	    Integer exp=Integer.parseInt(req.getParameter("exp"));
		empdto dto=new empdto();
		dto.setEmail(name1);
		dto.setEmail(email);
		dto.setGender(gender);
		dto.setEmpdept(dept);
		dto.setExperience(exp);
		EmpDao dao=new EmpDao();
		 boolean isSaved=dao.insert(dto);
		 String msg=null;
		 if(isSaved) {
			 msg="inserted";
		 }else {
			 msg="not inserted";
		 }
		 	
	req.setAttribute("msg", msg);
	req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
