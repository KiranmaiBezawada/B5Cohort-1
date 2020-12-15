<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<title>Add Commodity Details</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	</head>
	<body>
	<%--	<jsp:include page="/header"/> --%>
		<section class="container-fluid p-4">
		<h3>New Commodity</h3>
			<div class="col-sm-5">
			<form:form action="addCommodityDetails"
				method="POST" modelAttribute="commodity" class="form">
 
				<div class="form-control-group">
					<form:label path="commodityID" class="form-control-label">Commodity Code</form:label>
					<form:input path="commodityID" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="commodityType" class="form-control-label">Commodity Type</form:label>
					<form:select path="commodityType" class="form-control" id="commodityType">
						<option>Gold</option>
						<option>Silver</option>
					</form:select>
				</div>
				
				<div class="form-control-group">
					<form:label path="commodityPrice" class="form-control-label">Commodity Price</form:label>
					<form:input path="commodityPrice" class="form-control" type="text"/>
				</div>
				
				<div class="form-control-group">
					<form:label path="date" class="form-control-label">date</form:label>
					<form:input path="date" class="form-control" type="date"/>
				</div>
				
				<div class="form-control-group">
					<button class="btn btn-primary">Add Commodity Details</button>
				</div>
			</form:form>
			<a href="/pms"><input type="button" value="Home"></a>
			</div>
			
		</section>
	</body>
</html>