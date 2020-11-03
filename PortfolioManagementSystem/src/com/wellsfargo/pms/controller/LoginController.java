package com.wellsfargo.pms.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wellsfargo.pms.service.IInvestorService;
import com.wellsfargo.pms.service.InvestorServiceImpl;


@WebServlet({"/investorRegister","/investerLogin","/backOffficUserLogin","/adminLogin"})
public class LoginController extends HttpServlet {
	private IInvestorService iinvestorservice;

	public void init(ServletConfig config) throws ServletException{
		iinvestorservice = new InvestorServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	String userName = request.getParameter("username");

		String password = request.getParameter("password");
	String view = "";
if("admin".equals(userName)&&"admin".equals(password)) {
session.setAttribute("userName", userName);
view="index.jsp";
}else {
request.setAttribute("err","Invalid Credits");

			view="login_page.jsp";

		}

		request.getRequestDispatcher(view).forward(request, response);

	}



}
