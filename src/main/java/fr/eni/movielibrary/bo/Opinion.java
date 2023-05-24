package fr.eni.movielibrary.bo;

public class Opinion {
	private long id;
	private int note;
	private String comment;
	private Movie movie;
	
	public Opinion(long id, int note, String comment) {
		super();
		this.id = id;
		this.note = note;
		this.comment = comment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	private Member member;

	@Override
	public String toString() {
		return "Opinion [id=" + id + ", note=" + note + ", comment=" + comment + ", movie=" + movie + ", member="
				+ member + "]";
	}
	
	
}
