package com.coo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticeControlor
 */
@WebServlet("/NoticeControlor")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("NoticeController");
		
//		String command = request.getParameter("command");
//		String path = "";
//		
//		if (command.equals("List")) {
//			path = "noticeList.jsp";
//		}else {
//			path = "noticeSelect.jsp";
//		}
		
//		request.setAttribute("board", "notice");
//		RequestDispatcher view = request.getRequestDispatcher(path);
//		view.forward(request, response);
//		response.sendRedirect("noticeList.jsp");
		
		String url = request.getServletPath();
		String[] page = url.split("/");
		String[] page2 = page[page.length-1].split(".notice");
		String path = page2[0];
		
		System.out.println(path);
		
		


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
