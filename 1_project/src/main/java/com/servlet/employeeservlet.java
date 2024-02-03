package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.Dao.EmpDao;
import com.emp.dto.empdto;
@WebServlet("/select")
public class employeeservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String gender1=req.getParameter("gender");
		String dept1=req.getParameter("dept");
	    String exp1=req.getParameter("exp");
		empdto dto=new empdto();
	
		
		dto.setGender(gender1);
		dto.setEmpdept(dept1);
		if(!exp1.equals("")) {
		dto.setExperience(Integer.parseInt(exp1));
		}
	
		EmpDao dao=new EmpDao();
		List<empdto> emps=dao.getdto(dto);
		req.setAttribute("emps", emps);
		req.getRequestDispatcher("/view.jsp").forward(req, resp);
		
	}
	

}
