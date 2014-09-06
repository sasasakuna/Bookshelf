<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="css/login.css">
</head>
<body>
<form action="${pageContext.request.contextPath}/toLogin" method="post">
    <h1 class="login-title">Simple Login</h1>
    <input type="text" id="username" name="username" class="login-input" placeholder="UserName" autofocus>
    <input type="password" id="password" name="password" class="login-input" placeholder="Password">
    <input type="submit" value="Lets Go" class="login-button">
  <p class="login-lost"><a href="">Forgot Password?</a></p>
  </form>

</body>
</html>