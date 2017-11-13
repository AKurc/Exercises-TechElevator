<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<script type="text/javascript">
	$(document).ready(function () {
		$.validator.addMethod('capitals', function(thing){ //thing is just a variable name
			return thing.match(/[A-Z]/); //returns an array- true if it finds matches- false if it returns null/ so no matches
		}); //validator automatically returns a default message that the field must have an entry if you don't include a further message
		$("form").validate({
			
			rules : {
				userName : {
					required : true
				},
				password : {
					required : true, 
					minlength: 15, //puts rules in field
					capitals: true,
				},
				confirmPassword : {
					required : true,		
					equalTo : "#password"  
				}
			},
			messages : {	
				password: {
					minlength: "Password is too short, make it at least 15 characters", //for when minlength fails under field's rules
					capitals: "Field must include a capital letter",
				},
				confirmPassword : {
					equalTo : "Passwords do not match"
				}
			},
			errorClass : "error"
		});
	});
</script>

<c:url var="formAction" value="/users" />
<form method="POST" action="${formAction}">
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<div class="form-group">
				<label for="userName">User Name: </label>
				<input type="text" id="userName" name="userName" placeHolder="User Name" class="form-control" />
			</div>
			<div class="form-group">
				<label for="password">Password: </label>
				<input type="password" id="password" name="password" placeHolder="Password" class="form-control" />
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password: </label>
				<input type="password" id="confirmPassword" name="confirmPassword" placeHolder="Re-Type Password" class="form-control" />	
			</div>
			<button type="submit" class="btn btn-default">Create User</button>
		</div>
		<div class="col-sm-4"></div>
	</div>
</form>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />