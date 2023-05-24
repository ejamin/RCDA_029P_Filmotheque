package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {
	
	public Movie(Participant director, Genre genre, long id, String title, int year,
			int duration, String synopsis) {
		super();
		this.director = director;
		this.genre = genre;
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
	}
	private List<Opinion> opinions;
	private Participant director;
	private List<Participant> actors;
	private Genre genre;	
	private long id;
	private String title;
	private int year;
	private int duration;
	private String synopsis;
	
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public List<Opinion> getOpinions() {
		return opinions;
	}
	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}
	public Participant getDirector() {
		return director;
	}
	public void setDirector(Participant director) {
		this.director = director;
	}
	public List<Participant> getActors() {
		return actors;
	}
	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Movie [id = "+ id+"]\n"
				+ "    title : " + title + "[ year : " + year + ", duration : " + duration +"]\n"
				+ "    synopsis : "+ synopsis +"\n    director : " + director + "\n    actors : [\n");
		
		if(this.actors != null) {
			for(Participant actor : this.actors) {
				res.append("      " + actor.toString() + "\n");
			}
		}
		res.append("    ]");
		/*res.append("], opinions : [\n");
		if(this.opinions != null) {
			for(Opinion opi : this.opinions) {
				res.append(opi.toString()+"\n");
			}
		}
		res.append("]]");*/
		
		return res.toString();
	}
	
	
}
