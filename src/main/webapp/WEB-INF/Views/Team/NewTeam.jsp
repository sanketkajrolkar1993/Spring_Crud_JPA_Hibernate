<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Creation</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">HOME</a>
	<div>
		<form action="${pageContext.request.contextPath}/team/addNewTeam" method="post">
			<div>
				<label id="lblForName">Please Enter Team Name</label>
				<input type="text" id="name" name="name" value="">
			</div>		
			<div>
				<label id="lblForSports">Please Select Sport</label>
				<select id="sportId" name="sportId">
					<c:forEach items="${sports}" var="sports">
						<option value="${sports.id}">${sports.name}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<input type="submit" value="Save Team">
			</div>		
		</form>
	</div>
</body>
</html>