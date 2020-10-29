<html>
<head>
<title>Register Page</title>
</head>
<body>
<%@page import="java.time.LocalDateTime"%>
	<h1 style="background-color:powderblue;">Portfolio Mangement System</h1>
    <h2><%=LocalDateTime.now() %></h2>
<h1>Welcome</h1>
<h4><a href="welcome.jsp">Home</a></h4>
<form action="InvestorDetailsController" method="post">
<div>
<label>Firstname:</label>
<input type="text" name="firstname" required/>
</div>
<span></span>
<div>
<label>Lastname</label>
<input type="text" name="lastname" required/>
</div>
<div>
<label>Enter Date of Birth</label>
<input type="date" name="dob" required/>
</div>
<div>
<label>Enter Pan number</label>
<input type="text" name="pan" required/>
</div>
<div>
<label>Mobile</label>
<input type="number" name="mobile" required/>
</div>
<label>Choose UserID</label>
<input type="text" name="uid" required/>
</div>
</div>
<label>Choose Password</label>
<input type="text" name="pwd" required/>
</div>
<div>
<h1></h1>
<button>Register</button>
<button>Cancel</button>
</div>
</form>
</body></html>