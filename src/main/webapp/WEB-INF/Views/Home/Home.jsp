<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<label style="color: red;">${message}</label>

	<a href="${pageContext.request.contextPath}/sport/getNewSport">Add Sports</a>
	<a href="${pageContext.request.contextPath}/team/getNewTeam">Add Team</a>
	<a href="${pageContext.request.contextPath}/player/getNewPlayer">Add Player</a>
</body>
</html>