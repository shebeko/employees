var showAll;

$(function() {
	$("body").bind('click', function(event){$("#messageBlock").hide();});
	$("#staff tr a").bind('mouseover', highlight).bind('mouseout', unselect);
	$("#staff td a").bind('click', handleClick);
	if (showAll === undefined) {
			showAll = {};
	} 
});

// функция выделяет выбранную строку таблицы при наведении на ней мыши
function highlight(event) {
	$(event.target.parentElement.parentElement).children()
	.css('background-color', '#f7f21a');
}

// функция снимает выделение с выбранной строки таблицы при условии, 
// что выделение не фиксировано нажатием по ссылке внутри данной строки.
function unselect(event) {
	var unselectedRowId = $(event.target.parentElement.parentElement).attr('id');
	if (unselectedRowId !== showAll.curRow)
		$(event.target.parentElement.parentElement).children().css('background-color', '');
} 

// функция фиксирует выделение строки по щелчку по ссылке внутри строки,
// сохраняя id выделенной строки таблицы.
// При повторном щелчке по ссылке внутри той же выделенной строки
// фиксация отменяется.
function handleClick(event) {
	var clickedRowId = $(event.target.parentElement.parentElement).attr('id');
	if (showAll.curRow !== clickedRowId) {
		$("#"+showAll.curRow).children().css('background-color', '');
	}
	showAll.curRow = clickedRowId;
}
		
			