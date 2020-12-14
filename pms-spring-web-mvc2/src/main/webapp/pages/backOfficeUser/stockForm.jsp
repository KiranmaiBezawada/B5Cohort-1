<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<title>Add Stock Details</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	</head>
	<body>
	<%--	<jsp:include page="/header"/> --%>
		<section class="container-fluid p-4">
		<h3>New Stock</h3>
			<div class="col-sm-5">
			<form:form action="addStockDetails"
				method="POST" modelAttribute="stock" class="form">
			   <div class="form-control-group">
					<form:label path="companyCode" class="form-control-label">Company Code</form:label>
					<form:input path="companyCode" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="stockId" class="form-control-label">Stock Code</form:label>
					<form:input path="stockId" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="stockExchange" class="form-control-label">Stock Exchange</form:label>
					<form:input path="stockExchange" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="currentPrice" class="form-control-label">currentPrice</form:label>
					<form:input path="currentPrice" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="dateoftheStockPrice" class="form-control-label">Date</form:label>
					<form:input path="dateoftheStockPrice" class="form-control" type="date"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="stockPriceatSpecificTime" class="form-control-label">stockPriceatSpecificTime</form:label>
					<form:input path="stockPriceatSpecificTime" class="form-control" type="text"/>
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