package com.wellsfargo.pms.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wellsfargo.pms.service.IInvestorService;
import com.wellsfargo.pms.service.InvestorServiceImpl;


@WebServlet("/InvestorDetails")
public class InvestorDetailsController extends HttpServlet {
	private IInvestorService iinvestorservice;

	public void init(ServletConfig config) throws ServletException{
		iinvestorservice = new InvestorServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
