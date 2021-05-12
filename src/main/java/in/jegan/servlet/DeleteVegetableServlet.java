package in.jegan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.jegan.service.VegetableManager;

/**
 * Servlet implementation class DeleteVegetableServlet
 */
@WebServlet("/DeleteVegetableServlet")
public class DeleteVegetableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		//System.out.println("DeleteVegetableServlet");
		
		String vegetableName = request.getParameter("vegetableName");
	    boolean isDeleted = VegetableManager.deleteVegetable(vegetableName);
	    
	    if(isDeleted)
	    {
	         response.sendRedirect("ListVegetables.jsp");
	    }
	    else
	    {
	    	String errorMessage = "Unable to delete the Product Name";
	    	response.sendRedirect("ListVegetables.jsp?errorMessage" + errorMessage);
	    }
		
	}

	

}
