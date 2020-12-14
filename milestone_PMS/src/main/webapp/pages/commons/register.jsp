<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Register Page</title>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>
<jsp:include page="/commons/header2"/>
<section>
<h1>Register Form</h1>
<form:form  method="POST" modelAttribute="userde">

<form:label path="userpan"> PAN Number:</form:label><br>
<form:input  type="text" path="userpan" required="required" />
<br>

<form:label path="firstname">Firstname:</form:label><br>
<form:input type="text" path="firstname" required="required" />
<br>
<form:label path="lastName">Lastname</form:label><br>
<form:input type="text" path="lastName" required="required" />
<br>
<form:label path="dob">Date of Birth</form:label><br>
<form:input type="date" path="dob" required="required" />
<br>
<form:label path="usermobilenumber">Mobile</form:label><br>
<form:input type="number" path="usermobilenumber" required="required" />
<br>
<form:label path="address">Address</form:label><br>
<form:input type="text" path="address" required="required" />
<br>
<form:label path="username">Choose UserID</form:label><br>
<form:input type="text" path="username" required="required" />
<br>
<form:label path="password">Choose Password</form:label><br>
<form:input type="text" path="password" required="required" />
<br>
<h1></h1>
<button>Register</button>
<button><a href="/commons/header">Cancel</a></button>

</form:form>
</section>
</body></html>