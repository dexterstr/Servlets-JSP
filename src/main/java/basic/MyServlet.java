package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		
PrintWriter out=res.getWriter();

out.print("Hi <br>");

// we'll get obj of servlet context
//    ServletContext ctx= getServletContext();
//	
//	//method to give value specified in paraamter.
//	String str=ctx.getInitParameter("name");
//	out.print(str);
	
	ServletConfig sg=getServletConfig();
	String st=sg.getInitParameter("name");
	out.print(st);
			
	}
}