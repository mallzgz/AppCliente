package es.unizar.tmdad.appCliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;


@Controller
public class SearchController {


   /* @RequestMapping("/")
    public String greeting() {
        return "index";
    }*/

    @RequestMapping("/search")
    public JSONObject search(@RequestParam("book") String book, @RequestParam("author") String author,
    		@RequestParam("character") String character, @RequestParam("link") String link) throws IOException, JSONException {
    	
    	//m.addAttribute("res", twitter.search(q));
        //return "search :: content";
    	
        
        
    	if (book.equals("") && author.equals("") && character.equals("") && link.equals("")){
    		//Error (no parameters)
    		
    		return null;
    	}
    	
    	else{
    		JSONObject json = readJsonFromUrl("http://headers.jsontest.com/");
            System.out.println(json.toString());
            //System.out.println(json.get("id"));
            return json;
    	}
    }
    
	
	  private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }
	
	  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
	  }


  
}

