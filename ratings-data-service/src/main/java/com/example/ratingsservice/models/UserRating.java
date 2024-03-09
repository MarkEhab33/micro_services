package com.example.ratingsservice.models;

import java.util.List;

public class UserRating {
    private List<Rating> ratings;

    public UserRating() {
    }

    public UserRating(List<Rating> ratings) {
        this.ratings = ratings;
    }
    
//    public addToRatings(RatingResponse rate) {
//    	Rating r = new 
//    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
