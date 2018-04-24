package com.logicsoft.uttam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccoinLabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccoinLabsApplication.class, args);
	}
	
	private List<Movie> movies = new ArrayList<Movie>();
	
	@RequestMapping(value="/movies",method = RequestMethod.GET)
    public Movie greeting(@RequestParam(value="name", defaultValue="") String name) {
		return findFromList(name);
    }
	
	@RequestMapping(value="/movies",method = RequestMethod.PUT)
    public String create(@RequestBody Movie movie) {
		movies.add(movie);
		return "Ok";
    }
	
	@RequestMapping(value="/movies",method = RequestMethod.DELETE)
    public void delete(@RequestParam(value="name", defaultValue="") String name) {

		movies.remove(findFromList(name));
    }
	
	private Movie findFromList(String name) {
		return movies.stream().filter(movie -> movie.getName().equals(name)).findFirst().get();
		
	}
}
