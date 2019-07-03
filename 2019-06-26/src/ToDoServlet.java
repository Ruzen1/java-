

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ToDoServlet
 */
@WebServlet("/ToDoServlet")
public class ToDoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> todo = new ArrayList<>();
		FileReader fr = new FileReader("C:\\Users\\b7134\\eclipse-workspace\\2019-06-26\\todo.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) {
			if(line.equals("")) {
				continue;
			}
			todo.add(line);
		}
		
		String keyword = request.getParameter("keyword");
		
		if(keyword != null && !keyword.equals("")) {
			todo=todo.stream()
					.filter(e-> e.indexOf(keyword)>-1)
					.collect(Collectors.toCollection(ArrayList<String>::new));
		}
		
		request.setAttribute("todo",todo);
		request.getRequestDispatcher("todo.jsp").forward(request, response);
	}
	
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("todo_item");
		
		if (title !=null && ! title.equals("")) {
			ArrayList<String> todo = new ArrayList<>();
			FileReader fr = new FileReader ("C:\\\\Users\\\\b7134\\\\eclipse-workspace\\\\2019-06-26\\\\todo.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				if (line.equals("")) {
					continue;
				}
				todo.add(line);
			}
			fr.close();
			
			todo.add(title);
		
			
			FileWriter fw = new FileWriter ("C:\\\\Users\\\\b7134\\\\eclipse-workspace\\\\2019-06-26\\\\todo.txt");
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter pw = new PrintWriter (bw);
			for (String string:todo) {
				pw.println(string);
			}
			bw.flush();
			fw.close();
			
			response.sendRedirect(request.getRequestURI());
		}
		}

}