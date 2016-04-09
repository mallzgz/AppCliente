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
    public SearchResults search(@RequestParam("libro") String libro, @RequestParam("autor") String autor,
    		@RequestParam("personaje") String personaje, @RequestParam("link") String link) {
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
    	if (libro.equals("") && autor.equals("") && personaje.equals("") && link.equals("")){
    		//Devolvemos error (No hay parámetros)
    		
    		return null;
    	}
    	else if (libro.equals("") && autor.equals("") && personaje.equals("") && link.equals("")){
    		//Devolvemos error (No hay parámetros)
    		
    		return null;
    	}
    	else{
        return twitter.search(libro+autor+personaje+link);
    	}
    }
    
    
}