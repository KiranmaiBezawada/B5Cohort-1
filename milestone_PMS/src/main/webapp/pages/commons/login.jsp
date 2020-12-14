<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="/style.css"/>

</head>
<body>

<jsp:include page="/commons/header"/>

<h1>Welcome</h1>

<div>
<label>Username:</label>
<input type="text" name="username" required/>
</div>
<div>
<label>Password:</label>
<input type="text" name="password" required/>
</div>
<div>
<h1></h1>
<button><a href="/doLogin">Login</a></button>
<button><a href="/home">Cancel</a></button>
</div>

</body></html>