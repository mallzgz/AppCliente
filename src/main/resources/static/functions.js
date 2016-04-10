function search() {
	$.getJSON("https://books-analyzer.herokuapp.com/" + "search", {book: $("#book").val(), author: $("#author").val(), 
		character: $("#character").val(), url: $("#url").val()}, function(json) {
			var plantilla = $('#plantillaTwitter').html();
			$("#resultsBlock").empty().append(Mustache.to_html(plantilla, json));
			//$("#resultsBlock").empty().append(JSON.stringify(json));
		});
	});	
}


