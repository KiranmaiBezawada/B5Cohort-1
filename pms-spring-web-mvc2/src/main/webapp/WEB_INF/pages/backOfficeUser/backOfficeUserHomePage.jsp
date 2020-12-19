<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
	  
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Back Office User</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="registerNewCompany">AddCompanyDetails</a></li>
      <li><a href="registerNewStock">AddStockDetails</a></li>
      <li><a href ="registerNewCommodity">AddCommodityDetails</a></li>
      <li><a href ="showCompanySearchPage">GetCompanyDetails</a></li>

		<li><a href ="getallCompanyDetails">GetAllCompanyDetails</a></li>

		
    </ul>
  </div>
</nav>


<a href="home"><input type="button" value="Home Page"></a>

	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>

<jsp:include page="footer.jsp"/>
	</body>
</html>