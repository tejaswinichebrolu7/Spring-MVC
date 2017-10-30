<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Your Video</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	<h3>Update video</h3>
	
		<form action="/updateVideo" method="post" class="form-inline">
			<input name="id" type="hidden" value="${videos.id}"/>
			<fieldset class="form-group">
				<label>Description</label>
				<input name="desc" type="text" class="form-control" required="required" minlength="10" value="${videos.desc}"/>
			</fieldset>
		
			<button type="submit" class="btn btn-success">Update</button>
			
		</form>
		
	</div>

</body>
</html>