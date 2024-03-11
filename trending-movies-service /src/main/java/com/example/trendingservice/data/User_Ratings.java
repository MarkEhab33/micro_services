package com.example.trendingservice.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "rating")
@IdClass(RatingPK.class)
public class User_Ratings  implements Serializable{
	
	@Id
	@Column(name="userID")
	private String userID;
	
	@Id
	@Column(name="movieID")
	private String movieID;
	
	@Column(name="rating")
	private int rating;

	public String getMovieID() {
		return movieID;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	

}
