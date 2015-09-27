package com.mufasaweb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecommenderServlet
 */
@WebServlet("/RecommenderServlet")
public class RecommenderServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommenderServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userId = request.getParameter("userId");
		
		// Call recommending engine
		List<String> recList = CentralController.getRecommendations(userId);
		
		RecListBean b = new RecListBean();
		b.setRecList(recList);
		
		request.setAttribute("bean", b);
		RequestDispatcher rd = request.getRequestDispatcher("SimpleRecommendationList.jsp");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append(userId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Just automatically forward to doGet()
		doGet(request, response);
		
	}

}
