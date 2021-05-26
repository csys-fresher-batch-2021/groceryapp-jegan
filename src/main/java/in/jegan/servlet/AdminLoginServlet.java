package in.jegan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.jegan.service.AdminLoginManager;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	try {
			String adminEmail = request.getParameter("userEmail");
			String passWord = request.getParameter("passWord");
			boolean isValid = AdminLoginManager.adminLogin(adminEmail, passWord);
			
			if(isValid)
			{
				HttpSession session = request.getSession();
				session.setAttribute("ROLE", "ADMIN");
				response.sendRedirect("addVegetable.jsp");
			}
			else
			{
				String errorMessage = "Invalid Login Credentials";
				response.sendRedirect("adminLogin.jsp?errorMessage" + errorMessage);

			}
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			response.sendRedirect("adminLogin.jsp?errorMessage" + errorMessage);
			e.printStackTrace();
	} 		
		}
	}

