<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"  %>
<%@ page import="java.util.Map.Entry" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Fahrt" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Zeit" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Linie" %>
<%@ page import="de.nikolauspflege.bbw.fia.fp.Ziel" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewFile</title>
<style type="text/css">
.center {
    text-align: center;
    color: red;
}
.toprow { border-style: solid; background-color: green };
.mytab{width: 500px;  border-style: solid;
    border-color: red;};
.haltestelle {font-size: large;};
</style>
</head>
<body>
	<form action="./FpnServlet" method="post"> 
<h1>Fahrplan</h1>
		<div class=haltestelle>
Haltestelle 
		<select name="haltestelle" class=haltestelle>

  <option value="stadtmitte">Stadtmitte</option>
  <option value="nikolauspflege">Nikolauspflege, Kräherwald</option>
  <option value="carre">Carre</option>
</select> <br>
		</div>
		<table class=mytab>
<tr class=toprow><td class=toprow>Linie</td><td class=toprow>Ziel</td><td class=toprow>Zeit</td></tr>

<%
Fahrt[] fahrten = null;
if (request.getAttribute(Fahrt.attributName) instanceof Fahrt[]) {
  	fahrten  = (Fahrt[]) request.getAttribute(Fahrt.attributName);
  	if (fahrten != null) {
  	
  	    for (int i =0; i< fahrten.length; i++){  
%>
  	<tr><td class=center><%=fahrten[i].getLinie().toString()%></td><td class=center ><%=fahrten[i].getZiel().toString()%></td> <td class=center ><%=fahrten[i].getZeit().toString()%></td></tr>
  	   
<%  
		}
	}
}
%>
</table>
		<br>
<input type="submit" value="Submit" >
</form>
</body>
</html>