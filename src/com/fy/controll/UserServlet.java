package com.fy.controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制层:用户servlet
 * @author Administrator
 * @date  2019年10月9日
 */
public class UserServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		System.out.println(req.getMethod());
		//resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write("sucess");//往浏器回写信息
		resp.getWriter().print(req.getParameter("username")+"\n"+req.getParameter("password"));//往浏器回写信息
	}

}
