<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="<c:url value="css/form.css" />" rel="stylesheet">
<link href="<c:url value="css/main.css" />" rel="stylesheet">
<script src="<c:url value="js/addBookForm.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Welcome in library</title>
<script type="text/javascript">
	</script>
</head>
<body>
	<div class="bookList">
		<table>
			<tr>
				<th>Title</th>
				<th>Author</th>
				<th>Release date</th>
				<th>isbn</th>
			</tr>
			<c:forEach items="${books}" var="b">
				<tr>
					<td>${b.name}</td>
					<td>${b.author.name}${b.author.surname}</td>
					<td>${b.published}</td>
					<td>${b.isbn}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="addButtonDiv">
		<input type="button" value="Add book" onclick="showAddForm();"
			class="buttons" />

	</div>

	<div id="addBookDiv"></div>

</body>
</html>