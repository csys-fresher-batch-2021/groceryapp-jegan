package in.jegan.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.jegan.model.Vegetable;
import in.jegan.service.VegetableManager;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddVegetableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Override  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		try {
			String vegetableName = request.getParameter("vegetableName");
			Integer vegetablePrice = Integer.parseInt(request.getParameter("vegetablePrice"));
			Integer vegetableQuantity = Integer.parseInt(request.getParameter("vegetableQuantity"));
			Vegetable vegetableList = new Vegetable(vegetableName, vegetablePrice , vegetableQuantity);
				boolean isAdded=VegetableManager.addVegetables(vegetableList);
				
				if(isAdded)
				{
					String infoMessage = "Successfully added";
					response.sendRedirect("ListVegetables.jsp?infoMessage=" + infoMessage);
				}
				else
				{
					String errorMessage = "Unable to add Vegetable details";
					response.sendRedirect("addVegetable.jsp?errorMessage=" + errorMessage);
				}
				
			}
			catch(RuntimeException e)
			{
				String errorMessage = e.getMessage();
				response.sendRedirect("addVegetable.jsp?errorMessage=" + errorMessage);
				e.printStackTrace();
			}
		} 

	}
