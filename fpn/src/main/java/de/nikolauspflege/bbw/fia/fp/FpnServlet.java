package de.nikolauspflege.bbw.fia.fp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FpnServlet
 */
@WebServlet(description = "from base 4.0", urlPatterns = { "/FpnServlet" })
public class FpnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public static Map<String, String> getSimpleParameterMap(Map<String, String[]> parameters){
		Map<String, String> pMap = new HashMap<String, String>();
		for (Entry<String, String[]> parameter : parameters.entrySet()) {
			for (int i = 0; i < parameter.getValue().length; i++) {
				pMap.put(parameter.getKey(), parameter.getValue()[i]);
			}
		}
		return pMap;
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Map<String, String> pMap = getSimpleParameterMap(request.getParameterMap());
//				new HashMap<String, String>();
//		Map<String, String[]> parameters = request.getParameterMap();
//		for (Entry<String, String[]> parameter : parameters.entrySet()) {
//			for (int i = 0; i < parameter.getValue().length; i++) {
//				pMap.put(parameter.getKey(), parameter.getValue()[i]);
//			}
//		}
		request.setAttribute("pMap", pMap);
		request.setAttribute(Fahrt.attributName, new Tafel(pMap.get("haltestelle")));


		String nextJSP = "/Fahrplan.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
