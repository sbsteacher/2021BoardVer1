package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod")
public class BoardModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		System.out.println("no : " + no);
		int intNo = Integer.parseInt(no);
		
		BoardVO vo = Database.list.get(intNo);
		
		request.setAttribute("data", vo);
		String jsp = "/WEB-INF/jsp/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.println("no : " + no);
		System.out.println("title : " + title);
		System.out.println("ctnt : " + ctnt);
		
		int intNo = Integer.parseInt(no);
		BoardVO vo = Database.list.get(intNo);
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		//디테일 화면으로 이동
		response.sendRedirect("/detail?no=" + no);
	}

}















