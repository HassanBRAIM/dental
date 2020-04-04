package webAppServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webAppDao.LoginDAO;
import webAppDao.LoginDAODn;

/**
 * Servlet implementation class Login
 * @param <HttpServletRequest>
 */
@WebServlet("/Login")
public class Login<HttpServletRequest> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String choix = request.getParameter("RADIO");
		
		LoginDAODn LogD=new LoginDAODn();
		LoginDAO Log = new LoginDAO();
		
		if (choix.equals("Patient")) {
			if (Log.LoginCheck(username, password)) {
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("Home.jsp").forward(request, response);

			}
		}
		
		
		if (choix.equals("Dentist")) {
			if(LogD.LoginCheckDn(username, password)) {
				request.getRequestDispatcher("DcPage.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("Home.jsp").forward(request, response);
				
			}
		}

	}

}
