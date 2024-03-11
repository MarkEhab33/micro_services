package com.example.trendingservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<User_Ratings, RatingPK> {
//
//    List<User_Ratings> findByUserID(String userID);

    @Query(value = "SELECT * FROM rating ORDER BY rating DESC LIMIT 10", nativeQuery = true)
    List<User_Ratings> findTopTenHighestRatedMovies();
}

