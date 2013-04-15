<html>
	<head>
		<title>All employees</title>
	</head>
	<body>  
		<code><h2>All employees</h2></code>
		<g:if test='${updated}'>
			<div id="messageBlock" style="float:right">
				${updatedEmployee.firstName} ${updatedEmployee.lastName}
				<div class="updateMessage">
					updated
				</div>
			</div>		 
		</g:if>
		<g:customTable id="staff" collection="${employees}"  frame="singleEmployeeFrame" class="tableStyle"/>
		<g:javascript src="showAll.js" />
	</body>
</html>