package fr.eni.movielibrary.bo;

import java.util.List;

public class Member {
	public Member(long id, String lastName, String firstName, String login, String password) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Member [ id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", login=" + login + ", password=" + password + ", isAdmin=" + isAdmin + "]");
		
		return res.toString();
	}
	private List<Opinion> opinions;
	public List<Opinion> getOpinions() {
		return opinions;
	}
	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	private long id;
	private String lastName;
	private String firstName;
	private String login;
	private String password;
	private boolean isAdmin;
}
