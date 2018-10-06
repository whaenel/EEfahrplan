<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map"  %>
<%@ page import="java.util.Map.Entry" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewFile</title>
<style type="text/css">
.center {
    text-align: center;
    color: red;
};
.toprow { border-style: solid; background-color: green };
.mytab{width: 500px;  border-style: solid; border-color: red;};
.haltestelle {font-size: 20 px;};
</style>
</head>
<body>
	<form action="./FpnServlet" method="post"> 
<h1>Fahrplan</h1>
		<div class=haltestelle>

		<select name="cars">

  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>
		</div>
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
<% if ((pMap == null )||(pMap.size() ==0 )){ %>
<div>no parameters found ! </div>
<% } %>
		<br>
<input type="submit" value="Submit" >
</form>
</body>
</html>