package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/add")
public class AddServlet extends HttpServlet {

	//service is a method name which belongs to servlet lifecycle
	// we must use this method which takes 2 obj's - req & response
	/*
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//other methods like service are:
		//doGet-only for getrequest
		//doPost-only for Post request
		
		//Difference between GET and POST
		// use GET to fetch data and use POST to submit data.
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		// prints data on web page
		PrintWriter out= res.getWriter();
		
		out.println("result is "+k);
		
	}
	*/
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		//other methods like service are:
		//doGet-only for getrequest
		//doPost-only for Post request
		
		//Difference between GET and POST
		// use GET to fetch data and use POST to submit data.
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		
		Cookie cook= new Cookie("k",k+"");
		res.addCookie(cook);
		
		
		
//		HttpSession sess= req.getSession();
//		sess.setAttribute("k", k);
//		
		res.sendRedirect("sq");
		
		/*
		 req.setAttribute("k", k);
		  
		
		// prints data on web page
		PrintWriter out= res.getWriter();
		
		out.println("result is "+k);
	
		// Calling one Servlet from another Servlet  
		//Request Dispatcher is an interface call servlet using its name
		
		RequestDispatcher rd=req.getRequestDispatcher("/sq");
		rd.forward(req, res); 
		*/
		
		
	}
	
	
	
	
}
