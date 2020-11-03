<html>
<head>
<title>Commodity</title>
<%@page import="java.time.LocalDateTime"%>
	<h1 style="background-color:powderblue;">Portfolio Mangement System</h1>
    <h2><%=LocalDateTime.now() %></h2>
<h2>
welcome to commodity market 
</h2>
<span>|</span>
<a href="portfolioDashboard_display.jsp">Home</a>
<span>|</span>
<a href="index.jsp">Logout</a>
<span>|</span>
<form action="commodities"  method="post">
<h1>Gold</h1>
<h2>Current Price :</h2>
<button>Buy</button>
<button>Sell</button>
<h1>Silver</h1>
<h2>Current Price :</h2>
<button>Buy</button>
<button>Sell</button>
</form>
</head></html>