package com.heymurph.springboot.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="director")
public class Director {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="director")
	private int director;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;

	public Director() {
	}

	public Director(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getDirector() {
		return director;
	}

	public void setDirector(int director) {
		this.director = director;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Director [director=" + director + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
