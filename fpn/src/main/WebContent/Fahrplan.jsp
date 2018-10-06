<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"  %>
<%@ page import="java.util.Map.Entry" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Fahrt" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Zeit" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Linie" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Ziel" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Tafel" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewFile</title>
<style type="text/css">
.center {    text-align: center;  color: red };
.toprow { border-style: solid; background-color: green };
.mytab{width: 500px;  border-style: solid;border-color: red};
.haltestelle {font-size: large};
</style>
</head>
<body>
	<form action="./FpnServlet" method="post"> 
<h1>Fahrplan</h1>
		<div class=haltestelle>
Haltestelle 
<%
Tafel tafel =null;
Fahrt[] fahrten = null;
String haltestelle= null;
if (request.getAttribute(Fahrt.attributName) instanceof Tafel) {
  	tafel  = (Tafel) request.getAttribute(Fahrt.attributName);
  	fahrten  = tafel.getFahrten();
  	haltestelle = tafel.getHaltestelle();
}


 %>
			<select name="haltestelle" class=haltestelle title="Haltestelle">

				<option
					<%=("stadtmitte".equalsIgnoreCase(haltestelle))? "selected": ""%>
					value="stadtmitte" id="optionStadtmitte">Stadtmitte</option>
				<option
					<%=("nikolauspflege".equalsIgnoreCase(haltestelle))? "selected": ""%>
					value="nikolauspflege" id="optionNikolauspflege">Nikolauspflege,
					Kräherwald</option>
				<option <%=("carre".equalsIgnoreCase(haltestelle))? "selected": ""%>
					value="carre" id="optionCarre">Carre</option>
			</select> <br><br>Zeit: <%=tafel.getZeitAsString()%><br><br>
		</div>
		<table class=mytab>
<tr class=toprow><td class=toprow>Linie</td><td class=toprow>Ziel</td><td class=toprow>Zeit</td></tr>

<%
if (fahrten != null) {
  	
  	for (int i =0; i< fahrten.length; i++){  
%>
  	<tr><td class=center><%=fahrten[i].getLinie().toString()%></td><td class=center ><%=fahrten[i].getZiel().toString()%></td> <td class=center ><%=fahrten[i].getZeit().toString()%></td></tr>
  	   
<%  
	}
}
%>
</table>
		<br>
<input type="submit" value="Submit" >
</form>

<h1>Debug Info</h1>
<h3>Available Request Parameters</h3>
		<table class=mytab>
<tr class=toprow><td class=toprow>Name</td><td class=toprow>Value</td></tr>

<%
Map<?,?> pMap = null;
if (request.getAttribute("pMap") instanceof Map<?,?>) {
  	pMap = (Map<?,?>) request.getAttribute("pMap");
  	
	for (Entry<?,?> entry:  pMap.entrySet())  { %>
		<tr><td class=center><%= entry.getKey() %></td><td class=center ><%= entry.getValue() %></td></tr>

	<%} 
	}%>
</table>
</body>
</html>