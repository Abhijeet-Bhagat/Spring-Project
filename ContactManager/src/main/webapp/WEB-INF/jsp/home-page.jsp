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
	
	<form action="result-page" method="get">
	<div align="center">
		<label for="yn">UserName</label>
		<input type="text" id="yn" name = "userName">
		<br>
		<br>
		<label for="cn">CrushName</label>
		<input type="text" id="cn" name = "crushName">
		<br>
		<br>
		 <label for="checkbox">
                   <input type="checkbox" name="checkbox" required="required"> Agree that this is for fun!
         </label>
         <br>
         <br>
         <input type="submit" value="Calculate"/>
		
	</div>
	</form>
	
</body>
</html>