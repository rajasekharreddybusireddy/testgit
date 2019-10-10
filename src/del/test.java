package del;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// Setting up the content type of webpage
	      response.setContentType("text/html");

	      // Writing message to the web page
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + "raja" + "</h1>");
	}
}
