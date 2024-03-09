package com.example.ratingsservice.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<User_Ratings, RatingPK> {
	
    List<User_Ratings> findByUserID(String userID);
}

