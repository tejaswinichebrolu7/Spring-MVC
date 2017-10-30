<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Videos for ${name}</title>
</head>
<body>
	<H1>List of Videos</H1>
	<div>
		<table>
			<caption>Your Videos</caption>

			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Completed</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${videos}" var="videos">
					<tr>
						<td>${videos.desc}</td>
						<td>${videos.targetDate}</td>
						<td>${videos.done}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<a class="button" href="/addVideo">Add</a>
</body>
</html>