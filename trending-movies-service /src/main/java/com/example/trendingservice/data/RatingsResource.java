package com.example.trendingservice.data;

import com.example.trendingservice.generated.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Component
@Service
public class RatingsResource{
	 @Autowired
	 public  RatingRepository ratingRepository ;

	 public RatingsResource(){}
	 public List<MovieInfo> getTopTenTrendings() {
		List<User_Ratings> ans = ratingRepository.findTopTenHighestRatedMovies();

		List <MovieInfo> movies = new ArrayList<>();

		for(int i=0 ; i< ans.size();i++) {
			MovieInfo m =  MovieInfo.newBuilder().setMovieID( ans.get(i).getMovieID() )
							  .setRating(ans.get(i).getRating()).build();
			movies.add(m);
		  }

		return movies;
	 }
}
