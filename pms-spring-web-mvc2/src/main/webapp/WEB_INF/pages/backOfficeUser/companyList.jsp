<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<title>Company Details</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	</head>
	<body>
		<!--<jsp:include page="/header"/>-->
		<section class="container-fluid p-4">
			<h3>Company Details</h3>
			<c:choose>
				<c:when test="${company==null || company.isEmpty() }">
					<div class="alert alert-info">
						<p>No User Records Available!
					</div>
				</c:when>
				<c:otherwise>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Company Code</th>
								<th>companyTitle</th>
								<th>Company Sector</th>
								<th>Company Operations</th>
								<th>Share Count</th>	
								<th>Open Share Price</th>
								<th>Turn Over</th>					
							</tr>							
						</thead>
						<tbody>
							<c:forEach var="b" items="${company}">
								<tr>
								    <td>${b.companyCode}</td>
									<td>${b.companyTitle}</td>
									<td>${b.companySector}</td>
									<td>${b.companyOperations}</td>
									<td>${b.shareCount}</td>
									<td>${b.openSharePrice}</td>
									<td>${b.turnOver}</td>
									<td>
										<a href="/registerNewStock?companyCode=${b.companyCode}" class="btn btn-sm btn-info">
											Add Stock
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:otherwise>
			</c:choose>			
						
		</section>
		<a href="backOfficeUser"><input type="button" value="Back Office User Home Page"></a>
	</body>
</html>