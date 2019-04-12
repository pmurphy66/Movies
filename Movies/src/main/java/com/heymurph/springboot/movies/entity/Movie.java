package com.heymurph.springboot.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="movie")
	private int movie;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="director")
	private int director;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	public Movie() {
	}

	public Movie(int rating, int director, String name, String description) {
		this.rating = rating;
		this.director = director;
		this.name = name;
		this.description = description;
	}

	public int getMovie() {
		return movie;
	}

	public void setMovie(int movie) {
		this.movie = movie;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getDirector() {
		return director;
	}

	public void setDirector(int director) {
		this.director = director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", rating=" + rating + ", director=" + director + ", name=" + name + ", description=" + description + "]";
	}
	
}
