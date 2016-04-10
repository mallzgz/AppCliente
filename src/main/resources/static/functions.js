function search() {
	console.log("hola");
	var title= $("#title").val(); 
	var author= $("#author").val();
	var character= $("#character").val();
	var url= $("#url").val();
	var urlCompleta="https://books-analyzer.herokuapp.com/" + "search"+"?title="+title+"&author="+author+"&character="+character+"&url="+url;
	console.log(urlCompleta);
	$.ajax({
	    url: urlCompleta,
	    dataType: 'jsonp',
	    cache: 'false',
	    type: 'GET',
	    success: function(json){
	    var plantilla = $('#plantillaTwitter').html();
		console.log(urlCompleta);
		$("#resultsBlock").empty().append(Mustache.to_html(plantilla, json));
		//$("#resultsBlock").empty().append(JSON.stringify(json));
	    }
	});
}
