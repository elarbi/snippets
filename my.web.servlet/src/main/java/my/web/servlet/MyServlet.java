package my.web.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/serv")
// replaces the web.xml config
public class MyServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {

		String p1 = request.getParameter("p1");
		String p2 = request.getParameter("p2");
		response.getWriter().write(
				"Hello I'm a your servlet M. " + p1 + " " + p2);
		getServletContext().setAttribute("attr1", new Integer(365));
	}

}
