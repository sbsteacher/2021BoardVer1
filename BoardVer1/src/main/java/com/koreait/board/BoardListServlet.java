package com.koreait.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", Database.list);
		request.setAttribute("aaa1", 1);
		request.setAttribute("aaa2", "");
		request.setAttribute("aaa3", true);
		
		String jsp = "/WEB-INF/jsp/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
	
}
