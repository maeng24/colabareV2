<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file = "../common/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>유형 수정</h3>
<hr>

		<form action="modifyType" method="post" id="formType">
			<input type="hidden" name="todo_type_no" value="${type.todo_type_no }">
		제목:<input type="text" name="todo_type_title" value="${type.todo_type_title }" width:1000px; ><br>
		내용:<input type="hidden" name="todo_type_contents" value="${type.todo_type_contents }"><br>
	
		<br>	
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			<button type="button" value="수정" id="updateBtn" width:50px;  class="btn btn-effect-ripple btn-sm btn-success"><i class="fa fa-pencil">수정하기</button>
		</form>

	<a href="typelist">목록보기</a>


<script>
$(document).ready(function(e){
	
	var formType = $("#formType");
	
	$("#updateBtn").on("click", function(e){
		
		e.preventDefault();
		
		
		formType.submit();
		
		
	});
	
	
	
	
	
	
	
});
</script>
</body>
</html>