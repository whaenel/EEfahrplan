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
			Haltestelle <select name="haltestelle" class=haltestelle>

				<option value="stadtmitte">Stadtmitte</option>
				<option value="nikolauspflege">Nikolauspflege, Kräherwald</option>
				<option value="carre">Carre</option>
			</select> <br>
		</div>
		<br> <input type="submit" value="Submit">
	</form>
</body>

</html>
