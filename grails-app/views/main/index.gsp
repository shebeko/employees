<html>
 <head>
  <title>Employees</title>
  <g:javascript>
	$(function() {
		$("iframe")
			.width($("body")[0].clientWidth*0.4)
			.height($("body")[0].clientHeight);
	});
  </g:javascript>
  </head>
 <body>  
	<div>
		<iframe src="${createLinkTo(dir:'main', file:'showAll')}" name="allEmployeesFrame">
			Ваш браузер не поддерживает плавающие фреймы!
		</iframe>
	</div>
	<div>
		<iframe src="${createLinkTo(dir:'main', file:'edit')}" name="singleEmployeeFrame">
			Ваш браузер не поддерживает плавающие фреймы!
		</iframe>
	</div>	
 </body>
</html>