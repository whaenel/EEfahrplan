<html>
<head>
<style type="text/css">
.center {
	text-align: center;
	color: red;
}

.toprow {
	border-style: solid;
	background-color: green
}

;
.mytab {
	width: 500px;
	border-style: solid;
	border-color: red;
}

;
.haltestelle {
	font-size: large;
}
;
</style>
<title>Fahrplan</title>
</head>
<body>
	<img alt="tomcat icon" src="tomcat-power.gif">
	<h2>Hello Walter!</h2>

	<br>
	<form action="./FpnServlet" method="post">
		<h1>Fahrplan</h1>
		<div class=haltestelle>
			Haltestelle <select name="haltestelle"
				class=haltestelle id="myselect">

				<option value="stadtmitte" id="optionStadtmitte">Stadtmitte</option>
				<option value="nikolauspflege"  id="optionNikolauspflege">Nikolauspflege, Kräherwald</option>
				<option value="carre" id="optionCarre">Carre</option>
			</select> <br>
		</div>
		<br> <input type="submit" value="Submit" id="submitButton">
	</form>
</body>

</html>
