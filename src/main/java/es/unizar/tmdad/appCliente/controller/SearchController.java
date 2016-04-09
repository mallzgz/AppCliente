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

    @RequestMapping("/search1")
    public SearchResults search1(@RequestParam("q") String q) {
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
        return twitter.search(q);
    }
    @RequestMapping("/search2")
    public SearchResults search2(@RequestParam("r") String r) {
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
        return twitter.search(r);
    }
    
    @RequestMapping("/search3")
    public SearchResults search3(@RequestParam("s") String s) {
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
        return twitter.search(s);
    }
    
    @RequestMapping("/search4")
    public SearchResults search4(@RequestParam("t") String t) {
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
        return twitter.search(t);
    }
    
}