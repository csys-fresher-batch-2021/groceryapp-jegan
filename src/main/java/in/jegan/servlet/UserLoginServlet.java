package in.jegan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.jegan.service.LoginManager;


/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			try {
				String userEmail = request.getParameter("userEmail");
				String passWord = request.getParameter("passWord");
				
					boolean isValidUser = LoginManager.login(userEmail, passWord);
					if(isValidUser)
					{
						HttpSession session = request.getSession();
						session.setAttribute("userEmail", userEmail);
						response.sendRedirect("addVegetable.jsp");
					}
					else
					{
						String errorMessage = "Invalid Login Credentials";
						response.sendRedirect("userLogin.jsp?errorMessage" + errorMessage);

					}
				} catch (RuntimeException e) {
					String errorMessage = e.getMessage();
					response.sendRedirect("userLogin.jsp?errorMessage" + errorMessage);
					e.printStackTrace();
				}
			} 		
	}


