package cafe.jjdev.mall.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class IndexController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IndexController doGet");
		// 1. router : @WebServlet("/index")
		
		// 2. model호출 : DAO모델생성
		String model = "jjdev";
		// view rend...(template)
		
		request.setAttribute("model", model);
		// 4. Forward(request, response) to WEB-INF/jsp/index.jsp
		
		request.getRequestDispatcher("WEB-INF/jsp/index.jsp")
			.forward(request,response);
	}
}
