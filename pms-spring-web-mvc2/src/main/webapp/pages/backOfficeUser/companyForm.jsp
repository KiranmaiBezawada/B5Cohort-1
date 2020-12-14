<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<title>Add Company Details</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	</head>
	<body>
	<%--	<jsp:include page="/header"/> --%>
		<section class="container-fluid p-4">
		<h3>New Company</h3>
			<div class="col-sm-5">
			<form:form action="addCompanyDetails"
				method="POST" modelAttribute="company" class="form">

				<div class="form-control-group">
					<form:label path="companyCode" class="form-control-label">Company Code</form:label>
					<form:input path="companyCode" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="companyTitle" class="form-control-label">Company Title</form:label>
					<form:input path="companyTitle" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="companySector" class="form-control-label">Company Sector</form:label>
					<form:input path="companySector" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="companyOperations" class="form-control-label">Company Operations</form:label>
					<form:input path="companyOperations" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="shareCount" class="form-control-label">Share Count</form:label>
					<form:input path="shareCount" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="openSharePrice" class="form-control-label">Open Share Price</form:label>
					<form:input path="openSharePrice" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="turnOver" class="form-control-label">Turn Over</form:label>
					<form:input path="turnOver" class="form-control" type="text"/>
				</div>
				
				
			
				<div class="form-control-group">
					<button class="btn btn-primary">Add Company Details</button>
				</div>
			</form:form>
			<a href="/pms"><input type="button" value="Home"></a>
			</div>
			
		</section>
	</body>
</html>