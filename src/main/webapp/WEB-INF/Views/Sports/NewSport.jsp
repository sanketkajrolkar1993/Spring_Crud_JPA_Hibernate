<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Sport Creation</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">HOME</a>
	<div>
		<form action="${pageContext.request.contextPath}/sport/addNewSport"
			method="post">
			<div>
				<label id="lblForSportName">Please Enter Sport Name</label>
				<input type="text" id="name" name="name" value="">
			</div>
			<div>
				<input type="submit" value="Save Sport">
			</div>
		</form>
	</div>
</body>
</html>