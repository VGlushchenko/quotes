$(document).ready(function() {

	$('#add-button').click(function() {
		 $('<tr><td>jqery</td><td>jqery</td><td>jqery</td></tr>').insertAfter('tr:last-of-type');
	});

	$("table:nth-of-type(1)").css("border", "0")
	$("h1:last").css("color", "red");
	$("th").css("background-color", "#000").css("color", "#fff");
	$("tr:nth-of-type(odd)").css("background-color", "#f3f3f3");
	$("tr:nth-of-type(even)").css("background-color", "#ddd");
	$("td:nth-child(n+2)").css("text-align", "right");
	$("tr:last-of-type").css("font-weight", "bolder");
	$("table:nth-of-type(2) tr:nth-of-type(odd)").css("background-color", "red");
	$('table').after($('input'));
});