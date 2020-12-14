<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
	<head>
		<title>LMP-Genres</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	</head>
	<body>
		<!--<jsp:include page="/header"/>-->
		<section class="container-fluid p-4">
			
			<h3>Users</h3>
						
			<c:choose>
				<c:when test="${users==null || users.isEmpty() }">
					<div class="alert alert-info">
						<p>No User Records Available!
					</div>
				</c:when>
				<c:otherwise>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>User Id</th>
								<th>First Name</th>
								<th>Last Name</th>
							 <th>User Pan</th>
							<th>Gender</th>
								<th>Date of Birth</th>
								<th>Mobile Number</th>
								<th>Address</th>
								<th>Bonus</th>
								 <th>Register date</th>
								<th>Role</th>
								<th colspan="2"></th>
							</tr>							
						</thead>
						<tbody>
							<c:forEach var="b" items="${users}">
								<tr>
									<td>${b.userId }</td>
									<td>${b.firstname}</td>
									<td>${b.lastName }</td>
									<td>${b.userpan }</td>
									<td>${b.gender }</td>
									<td>${b.dob }</td>
									<td>${b.usermobilenumber }</td>
									<td>${b.address }</td>
									<td>${b.bonus }</td>
									  <td>${b.registereddate }</td>
									<td>${b.role }</td>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:otherwise>
			</c:choose>
		</section>
	</body>
</html>