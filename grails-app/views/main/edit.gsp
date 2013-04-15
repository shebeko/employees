<html>
 <head>
  <title>Single employee</title>
 </head>
 <body class="framestyle">
 	<g:if test="${employee}">
		<g:uploadForm name="updateForm" action="update" id="${employee.id}">
			<div style="float:right">
	 			<g:actionSubmit id="updateButton" value="Save" action="update" 
	 							title="click to update employee's info"
	 							formtarget="allEmployeesFrame"/>
	 		</div>
	 		<div id="data">
		 		<table id="edit">
		 			<tr>
		 				<td>Photo</td>
		 				<td><img src="${createLink(controller:'photo', action:'viewPhoto', id:employee.id)}"  alt="photo goes here" /><br />
		 					<input type="file" name="avatar">
		 				</td>
		 			</tr>
		 			<tr>
		 				<td>First name</td>
		 				<td><g:textField name="firstName" value="${employee?.firstName}" /></td> 
		 			</tr>
		 		    <tr>
		 		    	<td>Last name</td>
		 		    	<td><g:textField name="lastName" value="${employee?.lastName}" /></td>
		 		    </tr>
		 		    <tr>
		 		    	<td>Sex</td>
		 		    	<td><g:select name="sex" 
		 				  from="${['Male', 'Female']}"
		 				  value="${employee?.sex}" /> 
		 				</td>
		 		    </tr>	
		 			<tr>
		 				<td>Year of birth</td>
		 				<td><g:select name="yearOfBirth"
		 				  from="${1900..2000}"
		 				  value="${employee?.yearOfBirth}" />
		 				</td>
		 			</tr>
		 			<tr>
		 				<td>Position</td>
		 				<td><g:textField name="position" value="${employee?.position}" /></td>
		 			</tr>
					<tr>
						<td>Leave a comment</td>
						<td><g:textArea name="comment" value="${employee?.comment}" /></td>
					</tr> 		 
		 		</table>
	 		</div>
	 	</g:uploadForm>
 	</g:if>
 	<g:else>
 		<code><h3>Choose employee in the upper frame to edit</h3></code>
 	</g:else>  
	<g:javascript src="edit.js" />
 </body>
</html>