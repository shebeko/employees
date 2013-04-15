$(function() {
	$("#updateButton").bind("click", handleClick);
});

function handleClick(event) {
	$("form[name=updateForm]").submit();
	var newpath = location.pathname.replace(/[0-9]+$/, "");
	location.replace(newpath);
}