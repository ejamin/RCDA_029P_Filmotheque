package fr.eni.movielibrary.bo;

import java.util.List;

public class Participant {
	public Participant(long id, String lastName, String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	private long id;
	private String lastName;
	private String firstName;
	private List<Movie> moviesPlayed;
	private List<Movie> moviesDirected;
	
	public List<Movie> getMoviesPlayed() {
		return moviesPlayed;
	}
	public void setMoviesPlayed(List<Movie> moviesPlayed) {
		this.moviesPlayed = moviesPlayed;
	}
	public List<Movie> getMoviesDirected() {
		return moviesDirected;
	}
	public void setMoviesDirected(List<Movie> moviesDirected) {
		this.moviesDirected = moviesDirected;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return this.firstName + " " +  this.lastName + " [id=" + id + "]";
	}
	
}
