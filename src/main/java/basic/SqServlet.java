package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
	
//	HttpSession session=req.getSession();
//	 int k = (int)session.getAttribute("k");
	
	//int k=Integer.parseInt(req.getParameter("k"));
	
	
		
//		int k= (int)req.getAttribute("k");s
	int k=0;
	Cookie cook[]=req.getCookies();
	for(Cookie c:cook) {
		if(c.getName().equals("k")) {
			k=Integer.parseInt(c.getValue());
		}
	}
		k=k*k;
		// prints data on web page
		PrintWriter out= res.getWriter();
		
		out.println("Squaring Servlet "+k);
		
	System.out.println("Sentt");
	}
	
}
