<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Videos for ${name}</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container table-responsive">
	<h2 align="center">Videos</h2>
		<table class="table table-striped table-bordered table-hover">
			<%-- <caption>Your Videos</caption> --%>

			<thead>
				<tr class="info">
					<th>Description</th>
					<th>Date</th>
					<th>Completed</th>
					<th>Actions</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${videos}" var="videos">
					<tr class="warning">
						<td>${videos.desc}</td>
						<td>${videos.targetDate}</td>
						<td>${videos.done}</td>
						<td>
						<a type="button" class="btn btn-success btn-md" href="/updateVideo?id=${videos.id}">Edit</a>
							<a type="button" class="btn btn-danger btn-md" href="/deleteVideo?id=${videos.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="container">
	<a type="button" class="btn btn-primary" href="/addVideo">Add</a>
	</div>
</body>
</html>