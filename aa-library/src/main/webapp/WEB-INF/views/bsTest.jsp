<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<!-- Bootstrap core CSS -->
<link href="<c:url value="css/bootstrap.min.css"/>" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="<c:url value="css/ie10-viewport-bug-workaround.css"/>"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="<c:url value="css/navbar-fixed-top.css"/>" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<jsp:include page="navBar.jsp"></jsp:include>


	<div class="container">


		<table class="table table-condensed">
			<thead>
				<tr>
					<th>Title</th>
					<th>Author</th>
					<th>Release date</th>
					<th>ISBN</th>
					<th colspan="2" style="padding-left: 2%">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="b">
					<tr id='${b.id}'>
						<td>${b.title}</td>
						<td>${b.author.name}&nbsp${b.author.surname}</td>
						<td>${b.published}</td>
						<td>${b.isbn}</td>
						<td style="width: 50px">
							<button type="button" class="btn btn-primary btn-xs"
								onclick="editBook('${b.id}','${b.title}','${b.author.id}','${b.author.name}','${b.author.surname}','${b.published}','${b.isbn}');">Edit</button>
						</td>
						<td>
							<form action="removeBook" method="post">
								<input type="hidden" name="idToRemove" value="${b.id}" />
								<button type="submit" class="btn btn-danger btn-xs">Remove</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div style="width: 60%; padding: 50px; margin: auto">
		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse1"> Add a book</a>
					</h4>
				</div>
				<div id="collapse1" class="panel-collapse collapse in">
					<div class="panel-body">

						<!-- Book form -->

						<form:form class="form-horizontal" commandName="bookCommandForm"
							method="post" action="addBook">
							<div class="form-group">
								<label class="control-label col-sm-2" for="title">Title:</label>
								<div class="col-sm-10">
									<form:input path="title" type="text" class="form-control"
										id="inpTitle" placeholder="Enter title" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="author">Author:</label>
								<div class="col-sm-10">
									<form:select path="authorId" class="form-control">
										<form:options itemValue="id" items="${authors}" />
									</form:select>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="published">Published:</label>
								<div class="col-sm-10">
									<form:input path="published" type="text" class="form-control"
										id="inpPublished" placeholder="Published year" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="isbn">ISBN:</label>
								<div class="col-sm-10">
									<form:input path="isbn" type="text" class="form-control"
										id="inpIsbn" placeholder="Enter isbn" />
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-default">Add a
										book</button>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse2">Add an author</a>
					</h4>
				</div>
				<div id="collapse2" class="panel-collapse collapse">
					<div class="panel-body">

						<!-- Author form -->

						<form:form class="form-horizontal" commandName="authorForm"
							method="post" action="addAuthor">
							<div class="form-group">
								<label class="control-label col-sm-2" for="name">Name:</label>
								<div class="col-sm-10">
									<form:input path="name" type="text" class="form-control"
										id="inpName" placeholder="Enter name" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="surname">Surname:</label>
								<div class="col-sm-10">
									<form:input path="surname" type="text" class="form-control"
										id="inpSurname" placeholder="Enter surname" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="born">Born:</label>
								<div class="col-sm-10">
									<form:input path="born" type="text" class="form-control"
										id="inpBorn" placeholder="dd-mm-yyyy" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2" for="died">Died:</label>
								<div class="col-sm-10">
									<form:input path="died" type="text" class="form-control"
										id="inpDied" placeholder="dd-mm-yyyy" />
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-default">Add an
										author</button>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>













	<script src="<c:url value="js/jquery1.12.4.min.js" />"></script>

	<script>
		window.jQuery
				|| document
						.write('<script src="js/vendor/jquery.min.js"><\/script>')
	</script>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->


	<script src="<c:url value="js/bootstrap.min.js" />"></script>
	<script src="<c:url value="js/editBook.js" />"></script>


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="<c:url value="js/ie10-viewport-bug-workaround.js" />"></script>
</body>
</html>