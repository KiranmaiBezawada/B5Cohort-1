<html>
<head>
<title>Investor Summary</title>
</head>
<body>
<%@page import="java.time.LocalDateTime"%>
	<h1 style="background-color:powderblue;">Portfolio Mangement System</h1>
    <h2><%=LocalDateTime.now() %></h2>
<h1>Welcome</h1>
<span>|</span>
<a href="portfolioDashboard_display.jsp">Home</a>
<span>|</span>
<a href="index.jsp">Logout</a>
<form action="/summary" method="post"></form></body></html>