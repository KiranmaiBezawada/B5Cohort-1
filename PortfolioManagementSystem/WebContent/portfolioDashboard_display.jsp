
<%@page import="java.time.LocalDateTime"%><html>
<head>
<title>PortfolioDashboard</title></head>
<body>
	<h1 style="background-color:powderblue;">Portfolio Mangement System</h1>
    <h2><%=LocalDateTime.now() %></h2>
<h1>Welcome Kiran</h1>
<form action="PortfolioDashboard" method="post"><p>
<span>|</span>
<a href="summary.jsp">Summary</a>
<span>|</span>
<a href="equity.jsp">Equity</a>
<span>|</span>
<a href="commodity.jsp">Commodities</a>
<span>|</span>
<a href="sharemarket.jsp">Share Market</a>
<span>|</span>
<a href="ipocompanies.jsp">IPO_Companies</a>
<span>|</span>
<a href="index.jsp">Logout</a>
<span>|</span>
<h2>Amount invested: Rs 4,42,323</h2>
<span> </span>
<h2>Today's Profit: RS. 1,432</h2>
<span> </span>
</p>
</form>
</body></html>