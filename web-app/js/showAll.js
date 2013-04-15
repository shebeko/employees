var showAll;

$(function() {
	$("body").bind('click', function(event){$("#messageBlock").hide();});
	$("#staff tr a").bind('mouseover', highlight).bind('mouseout', unselect);
	$("#staff td a").bind('click', handleClick);
	if (showAll === undefined) {
			showAll = {};
	} 
});

// ������� �������� ��������� ������ ������� ��� ��������� �� ��� ����
function highlight(event) {
	$(event.target.parentElement.parentElement).children()
	.css('background-color', '#f7f21a');
}

// ������� ������� ��������� � ��������� ������ ������� ��� �������, 
// ��� ��������� �� ����������� �������� �� ������ ������ ������ ������.
function unselect(event) {
	var unselectedRowId = $(event.target.parentElement.parentElement).attr('id');
	if (unselectedRowId !== showAll.curRow)
		$(event.target.parentElement.parentElement).children().css('background-color', '');
} 

// ������� ��������� ��������� ������ �� ������ �� ������ ������ ������,
// �������� id ���������� ������ �������.
// ��� ��������� ������ �� ������ ������ ��� �� ���������� ������
// �������� ����������.
function handleClick(event) {
	var clickedRowId = $(event.target.parentElement.parentElement).attr('id');
	if (showAll.curRow !== clickedRowId) {
		$("#"+showAll.curRow).children().css('background-color', '');
	}
	showAll.curRow = clickedRowId;
}
		
			