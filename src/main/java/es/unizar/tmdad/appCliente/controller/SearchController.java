package es.unizar.tmdad.appCliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.unizar.tmdad.appCliente.service.TwitterLookupService;


@RestController
public class SearchController {

    @Autowired
    TwitterLookupService twitter;

   /* @RequestMapping("/")
    public String greeting() {
        return "index";
    }*/

    @RequestMapping("/search")
    public SearchResults search(@RequestParam("book") String book, @RequestParam("author") String author,
    		@RequestParam("character") String character, @RequestParam("link") String link) {
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
    	if (book.equals("") && author.equals("") && character.equals("") && link.equals("")){
    		//Error (no parameters)
    		
    		return null;
    	}

    	else{
        return twitter.search(book+author+character+link);
    	}
    }
    
    
}