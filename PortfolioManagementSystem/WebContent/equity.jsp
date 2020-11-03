<%@page import="java.time.LocalDateTime"%>
<html>
<head>
<title>equity</title>
<h1 style="background-color:powderblue;">Portfolio Mangement System</h1>
 <h2><%=LocalDateTime.now() %></h2>
<form action="ei"  method="post">
<span>|</span>
<a href="portfolioDashboard_display.jsp">Home</a>
<span>|</span>
<a href="index.jsp">Logout</a>
<span>|</span>
<h2>Relaince</h2>
<h2>share Price :</h2>
<button>Buy</button>
<button>Sell</button>
<h1>Trends</h1>
<h2>share Price :</h2>
<button>Buy</button>
<button>Sell</button>
</form>
</head></html>