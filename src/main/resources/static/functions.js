/*$(document).ready(function() {
	console.log("hola");
	search();
	console.log("hola2");

});*/
function search() {
	$.getJSON("https://books-analyzer.herokuapp.com/" + "search", {book: $("#book").val(), author: $("#author").val(), 
		character: $("#character").val(), url: $("#url").val()}, function(json) {
			var plantilla = $('#plantillaTwitter').html();
			$("#resultsBlock").empty().append(Mustache.to_html(plantilla, json));
			//$("#resultsBlock").empty().append(JSON.stringify(json));
		});
	});	
}
/*
function registerSearch() {
	$("#search").submit(function(ev){
		event.preventDefault();
		$.get($(this).attr('action'), {book: $("#book").val(), author: $("#author").val(), 
			character: $("#character").val(), link: $("#link").val()}, function(data) {
			//$("#resultsBlock").empty().append(data);
			var plantilla = $('#plantillaTwitter').html();
    		var html = Mustache.to_html(plantilla, data);
    		$("#resultsBlock").empty().append(html);
		});	
	});
}*/


