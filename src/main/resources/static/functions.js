$(document).ready(function() {
	//console.log("hola");
	registerSearch1();
	registerSearch2();
	registerSearch3();
	registerSearch4();
});

function registerSearch1() {
	$("#search1").submit(function(ev){
		event.preventDefault();
		$.get($(this).attr('action'), {q: $("#q").val()}, function(data) {
			//$("#resultsBlock").empty().append(data);
			var plantilla = $('#plantillaTwitter').html();
    		var html = Mustache.to_html(plantilla, data);
    		$("#resultsBlock1").empty().append(html);
		});	
		
	});
}
function registerSearch2() {
	$("#search2").submit(function(ev){
		event.preventDefault();
		$.get($(this).attr('action'), {r: $("#r").val()}, function(data) {
			//$("#resultsBlock").empty().append(data);
			var plantilla = $('#plantillaTwitter').html();
    		var html = Mustache.to_html(plantilla, data);
    		$("#resultsBlock2").empty().append(html);
		});	
		
	});
}
function registerSearch3() {
	$("#search3").submit(function(ev){
		event.preventDefault();
		$.get($(this).attr('action'), {s: $("#s").val()}, function(data) {
			//$("#resultsBlock").empty().append(data);
			var plantilla = $('#plantillaTwitter').html();
    		var html = Mustache.to_html(plantilla, data);
    		$("#resultsBlock3").empty().append(html);
		});	
		
	});
}
function registerSearch4() {
	$("#search4").submit(function(ev){
		event.preventDefault();
		$.get($(this).attr('action'), {t: $("#t").val()}, function(data) {
			//$("#resultsBlock").empty().append(data);
			var plantilla = $('#plantillaTwitter').html();
    		var html = Mustache.to_html(plantilla, data);
    		$("#resultsBlock4").empty().append(html);
		});	
		
	});
}