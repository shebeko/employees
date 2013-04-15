<table class='${tableClass}' id='${tableId}'>
	<tr>
		<th>№</th>
		<th>Employee</th>
	</tr>
	<g:each in="${employees}" var="e" status="i">
		<g:if test="${i%2}">
			<tr id="${e.id}" class="cellcolor">
		</g:if>
		<g:else>
			<tr id="${e.id}">
		</g:else>
		<td>${i+1}</td>
		<td><g:link action="edit" id="${e.id}" target="${frameName}">${e.firstName} ${e.lastName}</g:link></td>
			</tr>
	</g:each>			
</table>