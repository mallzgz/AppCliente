$(document).ready(function() {
	console.log("hola");
	registerSearch();
	console.log("hola2");

});

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
}
