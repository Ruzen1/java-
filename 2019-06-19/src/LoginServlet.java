

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		
		if(username.equals("kyuraku") && password.equals("oic")) {
			HttpSession sess = request.getSession();
			sess.setAttribute("login",true);
			sess.setAttribute("username",username);
			
			response.setStatus(200);
			response.getWriter().append("Login Success <a href= home.jsp>goto user home</a>");
		}else {
			response.setStatus(401);
			response.getWriter().append("Failed");
		}
	}
}

