<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
  
<html>
<head>
<title>LMP-Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
</head>
<body>
	
	<section class="container-fluid p-4">
		<div class="col-sm-4">
			<%-- <form action="${pageContext.request.contextPath}/validate" method="POST">
				<c:if test="${param.error != null}">
					Invalid Credentials! Access Denied!
				</c:if>
				<input type="hidden" name="${_csrf.parameterName}"	
						value="${_csrf.token}" />
				<div class="form-control-group">
					<label class="form-control-label">UserName: </label>
					<input class="form-control" type="text" name="username" />
				</div> 
				<div class="form-control-group">
					<label class="form-control-label">Password: </label>
					<input class="form-control" type="password" name="password" />
				</div>		
				<button>Sign In</button>
			</form> --%>
			<spring:form action="${pageContext.request.contextPath}/validate" method="POST">

		<table>
			<tr>
				<td><label>Enter Customer ID</label></td>
				<td><input  type="text" name="username"  /></td>
			</tr>
			<tr>
				<td><label>Enter Password</label></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
				<td><a href="register">Register Here</a></td>
			</tr>

		</table>

	</spring:form>
		</div>
	</section>
</body>
</html>