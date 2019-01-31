<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">HOME</a>
	<div>
		<form action="${pageContext.request.contextPath}/player/addNewPlayer" method="post">
			<div>
				<label id="lblForName">Please Enter Player Name</label>
				<input type="text" id="name" name="name" value="">
			</div>	
			<div>
				<label id="lblForName">Please Enter Jersy Number</label>
				<input type="text" id="jersyNo" name="jersyNo" value="">
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
				<label id="lblForSports">Please Select team</label>
				<select id="teamId" name="teamId">
					<c:forEach items="${teams}" var="teams">
						<option value="${teams.id}">${teams.name}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<input type="submit" value="Save Team">
			</div>		
		</form>
	</div>
	
	<script type="text/javascript" src="/resources/js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){
			
			$("#sportId").change(function(){
				debugger;
				var sports_id = $(this).val();
				$.ajax({
					url : "${pageContext.request.contextPath}/player/getTeamFromSport",
					data : sports_id,
					method : 'POST',
					dataType : "JSON",
					contentType : "application/json; charset=utf-8",
					success : function(data) {
  						alert("In")
  					},
  					error : function(data) {
  						console.log(data);
					}
				});
			});
			
		});
	
	</script>
	
</body>

</html>