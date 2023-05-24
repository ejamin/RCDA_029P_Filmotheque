package fr.eni.movielibrary.bo;

public class Genre {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	@Override
	public String toString() {
		return "Genre [id=" + id + ", label=" + label + "]";
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Genre(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	private long id;
	private String label;
}
