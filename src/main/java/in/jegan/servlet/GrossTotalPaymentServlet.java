package in.jegan.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.jegan.dto.CartItemDTO;
import in.jegan.service.PaymentManager;

/**
 * Servlet implementation class GrossTotalPaymentServlet
 */
@WebServlet("/GrossTotalPaymentServlet")
public class GrossTotalPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GrossTotalPaymentServlet() {
        super();    
        }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		List<CartItemDTO> cartItems = (List<CartItemDTO>) session.getAttribute("CART_ITEMS");
		
		PaymentManager payement = new PaymentManager();
		
		int grossTotal =  payement.calculateGrossTotal(cartItems);
		
		response.sendRedirect("orderDetails.jsp?grossTotal="+grossTotal);

	}

	

}
