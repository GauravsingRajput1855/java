package com.app.servilates;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/login",loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

	
	public void init() throws ServletException  {
		//user dao instance  here we initilize a implementation of userdao 
		try {
			userDao=new UserDaoImpl();
		}catch (Exception e) {
			
			//e.printStackTrace();
//to inform wc thet iniy() has failed re throw the exceptiion rapped in servletexception
			throw new ServletException("err in init of "+getClass(),e);
		} 
	}

	public void destroy() {
		//invoke daos cleanup method 
		try {
			userDao.cleanUp();
		} catch (Exception e) {
			
			//e.printStackTrace();
			//replace checked exception by unchecked
			throw new RuntimeException("err in ddestroy"+getClass(),e);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read req parameter email and passward 
		//invoke daos curd method 
		//chk null=invalid login ==send retry link 
		//not null => successful login : send validate user details to clnt
		
		
		//set content type ---------------------------------
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter())
		{
			String email=request.getParameter("em");
			String pwd=request.getParameter("pass");
			
			//-----------------------------------------
			//invoke daos curd method 
			
			User user=userDao.signIn(email, pwd);
			
			//-------------------------------------------------
			//check invalid login
			
			if(user==null)
				pw.print("<h5>invalid login please <a href='login.html'>retry</a></h5>");
			else
				//not null successfil login then in else 
				pw.print("<h5> login successful ,user details "+user+"</h5>");
		}catch (Exception e) 
			{	
				//e.printStackTrace();
			throw new ServletException("err in dopostn of"+getClass());
			}
		
	}

}
