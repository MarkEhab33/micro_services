package com.example.trendingservice.data;

import java.io.Serializable;

public class RatingPK implements Serializable {
	private String userID;
    private String movieID;

    // Constructors
    public RatingPK() {
    }

    public RatingPK(String userID, String movieID) {
        this.userID = userID;
        this.movieID = movieID;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    // Equals and HashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingPK ratingPK = (RatingPK) o;

        if (!userID.equals(ratingPK.userID)) return false;
        return movieID.equals(ratingPK.movieID);
    }

    @Override
    public int hashCode() {
        int result = userID.hashCode();
        result = 31 * result + movieID.hashCode();
        return result;
    }
}