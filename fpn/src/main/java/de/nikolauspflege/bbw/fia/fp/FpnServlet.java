package de.nikolauspflege.bbw.fia.fp;

import java.io.IOException;
import java.io.Writer;
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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FpnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served by tomcat1 at: ").append(request.getContextPath()).append("\n");
		Map <String,String> pMap = new HashMap<String,String>();
		Map <String, String[]>  parameters=request.getParameterMap();
//		Set<Entry<String, String[]>> x = parameters.entrySet();
		for (Entry <String, String[]> parameter:parameters.entrySet()) {
//			Writer respWriter = response.getWriter().append("Parameters:").append("\n");
			for (int i = 0; i < parameter.getValue().length; i++) {
//				respWriter.append(parameter.getKey()).append(" : ").append(parameter.getValue()[i]).append("\n");
				pMap.put(parameter.getKey(), parameter.getValue()[i]);
			}
		}
		request.setAttribute("pMap", pMap);
		
		Fahrt[] fahrten = new Fahrt[3];
		fahrten[0] = new Fahrt("S1", "Herrenberg", "11","34");
		fahrten[1] = new Fahrt("S60", "Böblingen", "11","37");
		fahrten[2] = new Fahrt("S1", "Kirchheim", "11","44");
		request.setAttribute(Fahrt.attributName, fahrten);
		
		String nextJSP = "/Fahrplan.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
