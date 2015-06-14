<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>This is porto</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js">

</script>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript" src="js/script.js">
</script>
<script type="text/javascript" src="js/filter.js">
</script>

<script type="text/javascript" src="js/jquery-ui-1.10.4.custom.min.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<div id="header">
		<div id="menu">
			<h2>jquery portofolio</h2>	
			<input id="search" type="text" style="position:relative;left:20%;" placeholder="search..."/>	
		</div>
	</div>
	<div id="overlay">
	</div>
	<div id="frame">
		<table>
		<tr>
			<td  id="left">
				<img src="images/left.png" alt="left"/>			
			
		</td>	
			<td id="right">
				<img src="images/right.png" alt="right"/>						
			</td>	
		</tr></table>
		<img id="main" src="" alt=""/>	
		<div id="description">
			<p></p>
		</div>
	</div>
	<div id="wrapper">
		<ul id="filter">
			<li class="active">all</li>
			<li>nature</li>
			<li>city</li>
			<li>arhitecture</li>
		</ul>
	<%@include file="list.jsp" %>
	</div>
</body>
</html>