function search() {
	console.log("hola");
	var title= $("#title").val(); 
	var author= $("#author").val();
	var character= $("#character").val();
	var url= $("#url").val();
	var web="https://books-analyzer.herokuapp.com/" + "search"+"?title="+title+"&author="+author+"&character="+character+"&url="+url;
	console.log(web);
	$.ajax({
	    url: web,
	    dataType: 'jsonp',
	    success: function(json){
	    var plantilla = $('#plantillaTwitter').html();
		$("#resultsBlock").empty().append(Mustache.to_html(plantilla, json));
		//$("#resultsBlock").empty().append(JSON.stringify(json));
	    }
	});
}
