<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<title>User Registration Form</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<!--  <script src="~/Scripts/jquery.validate.unobtrusive.min.js"></script>-->	
	<style >
	  .error{
	  color : red;
	  font-style : italic;
	  }
	</style>
	</head>
	<body>
	<%--	<jsp:include page="/header"/> --%>
		<section class="container-fluid p-4">
		<h3>New User</h3>
			<div class="col-sm-5">
			<form:form action="add"
				method="POST" modelAttribute="user" class="form">

				<div class="form-control-group">
					<form:label path="firstname" class="form-control-label">First Name</form:label>
					<form:input path="firstname" class="form-control" type="text" />
					<form:errors path="firstname" cssClass="error"></form:errors>
				</div>
				<div class="form-control-group">
					<form:label path="lastName" class="form-control-label">Last Name</form:label>
					<form:input path="lastName" class="form-control" type="text" />
					<form:errors path="lastName" cssClass="error"></form:errors>
				</div>
				
				<div class="form-control-group">
					<form:label path="gender" class="form-control-label">Gender</form:label>
					<form:select path="gender" class="form-control" id="gender" >
						<option>Male</option>
						<option>Female</option>
					</form:select>
				</div>
				
				<div class="form-control-group">
					<form:label path="dob" class="form-control-label">Date of Birth</form:label>
					<form:input path="dob" class="form-control" type="date" />
				</div>
				
				<div class="form-control-group">
					<form:label path="usermobilenumber" class="form-control-label">Mobile Number</form:label>
					<form:input path="usermobilenumber" class="form-control" type="text" />
					<form:errors path="usermobilenumber" cssClass="error"></form:errors>
				</div>
				
				<div class="form-control-group">
					<form:label path="address" class="form-control-label">Address</form:label>
					<form:input path="address" class="form-control" type="text" />
					<form:errors path="address" cssClass="error"></form:errors>
				</div>
				
				<div class="form-control-group">
					<form:label path="userpan" class="form-control-label">PAN Number</form:label>
					<form:input path="userpan" class="form-control" type="text" />
					<form:errors path="userpan" cssClass="error"></form:errors>
				</div>
				
				<div class="form-control-group">
					<form:label path="password" class="form-control-label">Password</form:label>
					<form:input path="password" class="form-control" type="password" />
					<form:errors path="password" cssClass="error"></form:errors>
				</div>
			
				<div class="form-control-group">
					<button class="btn btn-primary">Register</button>
				</div>
			</form:form>
			<a href="/pms"><input type="button" value="Home"></a>
			</div>
			
		</section>
	</body>
</html>