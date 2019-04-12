package com.heymurph.springboot.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="rating")
		private int rating;
		
		@Column(name="ratingcode")
		private String ratingcode;
		
		@Column(name="ratingvalue")
		private String ratingvalue;
			
		@Column(name="description")
		private String description;
		
		public Rating() {
		}

		public Rating(String ratingcode, String ratingvalue, String description) {
			this.ratingcode = ratingcode;
			this.ratingvalue = ratingvalue;
			this.description = description;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getRatingcode() {
			return ratingcode;
		}

		public void setRatingcode(String ratingcode) {
			this.ratingcode = ratingcode;
		}

		public String getRatingvalue() {
			return ratingvalue;
		}

		public void setRatingvalue(String ratingvalue) {
			this.ratingvalue = ratingvalue;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Rating [rating=" + rating + ", ratingcode=" + ratingcode + ", ratingvalue=" + ratingvalue + ", description=" + description + "]";
		}
		
}
