package mavs_catering.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import masv_catering.model.User;
import masv_catering.model.UserErrorMsgs;
import mavs_catering.data.UserDAO;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				//String action = request.getParameter("action");
				HttpSession session = request.getSession();	
				String url = "/register.jsp";
				System.out.println(url);
				User user = new User();
				
//				if (action.equalsIgnoreCase("register")) {

				user.setUser(request.getParameter("username"), request.getParameter("password"),
						request.getParameter("role"),  request.getParameter("utaId"),
						request.getParameter("firstName"), request.getParameter("lastName"), 
						request.getParameter("phone"),request.getParameter("email"), 
						request.getParameter("streetNumber"),request.getParameter("streetName"),
						request.getParameter("city"),request.getParameter("state"),
						request.getParameter("zipcode"));
				UserErrorMsgs UerrorMsgs = new UserErrorMsgs();
				//user.validateUser(user, UerrorMsgs);
				session.setAttribute("User",user);
				session.setAttribute("errorMsgs",UerrorMsgs);
				if (UerrorMsgs.getErrorMsg().equals("")) {
					UserDAO.registerUser(user); //save employee if no errors
					session.removeAttribute("User");
					session.removeAttribute("errorMsgs");
					url = "/index.jsp"; //if successful, redirect to index
				}
//				}
				getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
