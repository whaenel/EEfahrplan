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
		Map <String,String> pMap = new HashMap<String,String>();
		Map <String, String[]>  parameters=request.getParameterMap();
		for (Entry <String, String[]> parameter:parameters.entrySet()) {
			for (int i = 0; i < parameter.getValue().length; i++) {
				pMap.put(parameter.getKey(), parameter.getValue()[i]);
			}
		}
		request.setAttribute("pMap", pMap);
		
		String haltestelle = pMap.get("haltestelle");
		if (haltestelle == null) {
			haltestelle = "stadtmitte";
		}
		
		Fahrt[] fahrtenStadtmitte = new Fahrt[3];
		fahrtenStadtmitte[0] = new Fahrt("S1", "Herrenberg", "11","34");
		fahrtenStadtmitte[1] = new Fahrt("S60", "Böblingen", "11","37");
		fahrtenStadtmitte[2] = new Fahrt("S1", "Kirchheim", "11","44");
		
		Fahrt[] fahrtenNikolauspflege = new Fahrt[3];
		fahrtenNikolauspflege[0] = new Fahrt("40", "Vogelsang", "11","34");
		fahrtenNikolauspflege[1] = new Fahrt("40", "Hauptbahnhof", "11","37");
		fahrtenNikolauspflege[2] = new Fahrt("40", "Vogelsang", "11","44");

		if (haltestelle.equalsIgnoreCase("stadtmitte")) {
			request.setAttribute(Fahrt.attributName, fahrtenStadtmitte);
		} else {
			request.setAttribute(Fahrt.attributName, fahrtenNikolauspflege);
		}
		
		request.setAttribute("uhrzeit", new Zeit().toString());
		request.setAttribute("haltestelle", haltestelle);
		
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
