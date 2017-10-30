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
	<h3>Add a video</h3>
	
		<form action="/addVideo" method="post" class="form-inline">
			<fieldset class="form-group">
				<label>Description</label>
				<input name="desc" type="text" class="form-control" required="required" minlength="10"/>
			</fieldset>
		
			<button type="submit" class="btn btn-success">Add</button>
			
		</form>
		
	</div>

</body>
</html>