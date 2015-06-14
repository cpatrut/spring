package ro.catalin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.catalin.service.LogginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loggin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId,password;
		userId=request.getParameter("userId");
		password=request.getParameter("password");
		
		LogginService logginService=new LogginService();
		boolean result=logginService.authenticate(userId, password);

		if(result==true){
			response.sendRedirect("succes.jsp");
			return ;
		}else{
			response.sendRedirect("Loggin.jsp");
			return;
		}
	
	}

}
