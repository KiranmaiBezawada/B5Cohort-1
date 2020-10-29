<html>
<head>
<title>Login Page</title>
</head>
<body>
<%@page import="java.time.LocalDateTime"%>
	<h1 style="background-color:powderblue;">Portfolio Mangement System</h1>
    <h2><%=LocalDateTime.now() %></h2>
<h1>Welcome</h1>
<h4><a href="index.jsp">Home</a></h4>
<form action="InvestorDetails" method="post">
<div>
<label>Username:</label>
<input type="text" name="username" required/>
</div>
<div>
<label>Password:</label>
<input type="text" name="password" required/>
</div>
<div>
<h1></h1>
<button>Login</button>
<button>Cancel</button>
</div>
</form>
</body></html>