<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<title>PortfolioDashboard</title>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>
<jsp:include page="/commons/header2"/>
<section><h3> Hello ${userde.firstname}</h3>
<c:if test="${userde != null }">
<table>
<tr><td>Pan</td><td><strong>${userde.userpan}</strong></td></tr>
<tr><td>FirstName</td><td><strong>${userde.firstname}</strong></td></tr>
<tr><td>LastName</td><td><strong>${userde.lastName}</strong></td></tr>
<tr><td>UserName</td><td><strong>${userde.username}</strong></td></tr>
<tr><td>DateOfBirth</td><td><strong>${userde.dob}</strong></td></tr>
<tr><td>Address</td><td><strong>${userde.address}</strong></td></tr>
<tr><td>Mobile</td><td><strong>${userde.usermobilenumber}</strong></td></tr>
</table>
</c:if>
</section>
</body></html>