package in.jegan.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.jegan.dto.CartItemDTO;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
    	HttpSession session = request.getSession();
    	
    	try {
			String vegetableName = request.getParameter("vegetableName");
			Integer vegetablePrice = Integer.parseInt(request.getParameter("vegetablePrice"));
			Integer vegetableQuantity = Integer.parseInt(request.getParameter("vegetableQuantity"));
			Integer totalPrice = Integer.parseInt(request.getParameter("totalPrice"));

			CartItemDTO item = new CartItemDTO(vegetableName, vegetablePrice, vegetableQuantity, totalPrice);
			
			//1. Get Cart Items
			List<CartItemDTO> cartItems = (List<CartItemDTO>)session.getAttribute("CART_ITEMS");
			if(cartItems ==null) {
			 cartItems = new ArrayList<>();
			}
			
			cartItems.add(item);
			
			session.setAttribute("CART_ITEMS", cartItems);
			

			response.sendRedirect("orderDetails.jsp");
			
		} catch (NumberFormatException e) {
			String errorMessage = "there is no order";
			response.sendRedirect("order.jsp?errorMessage=" +errorMessage);
			e.printStackTrace();
		}
		
	}

	

}
