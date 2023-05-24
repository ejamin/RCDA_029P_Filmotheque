package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;

@Controller("movieBean")
public class MovieController {
	
	@Autowired
	public MovieService movieService;
	
	public Movie findMovie(int idMovie) {
		return movieService.getMovieById(idMovie);
	}
	
	public List<Movie> showAllMovies(){
		return movieService.getAllMovies();
	}
}
