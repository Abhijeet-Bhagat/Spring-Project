<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	
	<form:form action="result-page" method="get" modelAttribute="userdto">
	<div align="center">
		<label for="yn">UserName</label>
		<form:input type="text" id="yn" path = "userName" />
		<br>
		<br>
		<label for="cn">CrushName</label>
		<form:input type="text" id="cn" path = "crushName" />
		<br>
		<br>
		<!--  <label for="checkbox">
                   <input type="checkbox" name="checkbox" required="required"> Agree that this is for fun!
         </label> -->
         <br>
         <br>
         <!-- <input type="submit" value="Calculate"/> -->
         
         <form:button>Calculate</form:button>
		
	</div>
	</form:form>
	
</body>
</html>