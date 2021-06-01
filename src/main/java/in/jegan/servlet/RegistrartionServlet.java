package in.jegan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.jegan.model.Registration;
import in.jegan.service.RegistrationManager;

/**
 * Servlet implementation class RegistrartionServlet
 */
@WebServlet("/RegistrartionServlet")
public class RegistrartionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			Long userMobileNumber = Long.parseLong(request.getParameter("userMobileNumber"));
			String userEmail = request.getParameter("userEmail");
			
			Registration userDetails = new Registration(userName, passWord, userMobileNumber, userEmail);
			
				boolean isValidUser = RegistrationManager.addUser(userDetails);
				if(isValidUser)
				{
					String infoMessage = "Succesfully registered";
					response.sendRedirect("registrationDetails.jsp?=" + infoMessage);
					
				}
				else
				{
					String errorMessage = "Unable to add User Details";
					response.sendRedirect("userRegistration.jsp?errorMessage=" + errorMessage);
				}
			}
		    catch (RuntimeException e) {
				String errorMessage = e.getMessage();
				response.sendRedirect("userRegistration.jsp?errorMessage=" + errorMessage);
				e.printStackTrace();
			}
		} 
		
	}

