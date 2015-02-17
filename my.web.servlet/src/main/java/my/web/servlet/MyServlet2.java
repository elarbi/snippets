package my.web.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/serv2")
// replaces the web.xml config
public class MyServlet2 extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {

		Object attribute = getServletContext().getAttribute("attr1");
		response.getWriter().write(
				"Hello I'm a your 2nd servlet and I can reuse the attribute set by the first servlet into the ServletContext " + attribute);
	}

}
