package fr.eni.movielibrary.bll;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;

@Service
@Profile("dev")
public class MovieServiceMock implements MovieService{
	private List<Movie> lstMovies;
	private List<Genre> lstGenres;
	private List<Participant> lstParticipants;
	
	public MovieServiceMock() {
		lstMovies = new ArrayList<Movie>();
		lstGenres = new ArrayList<Genre>();
		lstParticipants = new ArrayList<Participant>();
		
		Genre animation = new Genre(1,"Animation");
		Genre sciFi = new Genre(2,"Science-Fiction");
		Genre documentaire = new Genre(3,"Documentaire");
		Genre action = new Genre(4,"Action");
		Genre comedie = new Genre(5,"Comédie");
		Genre drame = new Genre(6,"Drame");
		
		Participant real1 = new Participant(1,"Spielberg","Steven");
		Participant real2 = new Participant(2,"Mickael","Bay");		
		Participant acteur1 = new Participant(3,"Neil","Sam");
		Participant acteur2 = new Participant(4,"Dern","Laura");
		Participant acteur3 = new Participant(5,"Elgort","Ansel");
		Participant acteur4 = new Participant(6,"Zegler","Rachel");
		Participant acteur5 = new Participant(7,"GoldBlum","Jeff");
		Participant acteur6 = new Participant(8,"Labeouf","Shia");
		Participant acteur7 = new Participant(9,"Fox","Megan");
		
		Movie movie1 = new Movie(real1,sciFi,1,"Jurassic Park",1993,127,"Ne pas réveiller le chat qui dort -- c'est ce que le milliardaire John Hammond aurait dû se rappeler avant de se lancer dans le clonage de dinosaures. C'est à partir d'une goutte de sang absorbée par un moustique fossilisé que John Hammond et son équipe ont réussi à faire renaître une dizaine d'espèces de dinosaures.");
		Movie movie2 = new Movie(real1,comedie,2,"West Side Story",2021,156,"En 1957, les Jets, une bande de jeunes blancs, se battent contre la bande portoricaine des Sharks pour la domination de San Juan Hill dans l'Upper West Side de Manhattan");
		Movie movie3 = new Movie(real2,sciFi,3,"Transformers",2007,144,"Une guerre sans merci oppose depuis des temps immémoriaux deux races de robots extraterrestres : les Autobots et les cruels Decepticons. Son enjeu : la maîtrise de l'univers. Dans les premières années du 21ème siècle, le conflit s'étend à la Terre, et le jeune Sam Witwicky devient, à son insu, l'ultime espoir de l'humanité. Semblable à des milliers d'adolescents, Sam n'a connu que les soucis de son âge : le lycée, les amis, les voitures, les filles.");
		
		List<Movie> moviesReal1 = new ArrayList<Movie>();
		moviesReal1.add(movie1);
		moviesReal1.add(movie2);
		List<Movie> moviesReal2 = new ArrayList<Movie>();		
		moviesReal2.add(movie3);
		
		real1.setMoviesDirected(moviesReal1);
		real2.setMoviesDirected(moviesReal2);
		
		List<Participant> acteursMovie1 = new ArrayList<Participant>();
		acteursMovie1.add(acteur1);
		acteursMovie1.add(acteur2);
		acteursMovie1.add(acteur5);
		movie1.setActors(acteursMovie1);
		List<Participant> acteursMovie2 = new ArrayList<Participant>();
		acteursMovie2.add(acteur3);
		acteursMovie2.add(acteur4);
		acteursMovie2.add(acteur5);		
		movie2.setActors(acteursMovie2);
		List<Participant> acteursMovie3 = new ArrayList<Participant>();				
		acteursMovie3.add(acteur6);
		acteursMovie3.add(acteur7);		
		movie3.setActors(acteursMovie3);
		
		List<Movie> moviesActeur1 = new ArrayList<Movie>();
		List<Movie> moviesActeur2 = new ArrayList<Movie>();
		List<Movie> moviesActeur3 = new ArrayList<Movie>();
		List<Movie> moviesActeur4 = new ArrayList<Movie>();
		List<Movie> moviesActeur5 = new ArrayList<Movie>();
		List<Movie> moviesActeur6 = new ArrayList<Movie>();
		List<Movie> moviesActeur7 = new ArrayList<Movie>();
		
		moviesActeur1.add(movie1);
		moviesActeur2.add(movie1);
		moviesActeur5.add(movie1);		

		moviesActeur3.add(movie2);
		moviesActeur4.add(movie2);
		moviesActeur5.add(movie2);

		moviesActeur6.add(movie3);
		moviesActeur7.add(movie3);		
		
		acteur1.setMoviesPlayed(moviesActeur1);
		acteur2.setMoviesPlayed(moviesActeur2);
		acteur3.setMoviesPlayed(moviesActeur3);
		acteur4.setMoviesPlayed(moviesActeur4);
		acteur5.setMoviesPlayed(moviesActeur5);
		acteur6.setMoviesPlayed(moviesActeur6);
		acteur7.setMoviesPlayed(moviesActeur7);
		
		lstGenres.add(animation);
		lstGenres.add(sciFi);
		lstGenres.add(documentaire);
		lstGenres.add(action);
		lstGenres.add(comedie);
		lstGenres.add(drame);
				
		lstParticipants.add(real1);	
		lstParticipants.add(real2);
		lstParticipants.add(acteur1);	
		lstParticipants.add(acteur2);	
		lstParticipants.add(acteur3);	
		lstParticipants.add(acteur4);	
		lstParticipants.add(acteur5);	
		lstParticipants.add(acteur6);	
		lstParticipants.add(acteur7);
		
		lstMovies.add(movie1);
		lstMovies.add(movie2);
		lstMovies.add(movie3);			
	}
	
	@Override
	public List<Movie> getAllMovies() {
		return lstMovies;
	}

	@Override
	public Movie getMovieById(long id) {
		for (Movie movie : lstMovies) {
			if (movie.getId() == id) {
				return movie;
			}
		}
		return null;
	}

	@Override
	public List<Genre> getGenres() {
		return lstGenres;
	}

	@Override
	public List<Participant> getParticipants() {
		return lstParticipants;
	}

	@Override
	public Genre getGenreById(long id) {
		for (Genre genre : lstGenres) {
			if (genre.getId() == id) {
				return genre;
			}
		}
		return null;
	}

	@Override
	public Participant getParticipantById(long id) {
		for (Participant participant : lstParticipants) {
			if (participant.getId() == id) {
				return participant;
			}
		}
		return null;
	}

	@Override
	public void saveMovie(Movie movie) {
		lstMovies.add(movie);
	}
	
}
