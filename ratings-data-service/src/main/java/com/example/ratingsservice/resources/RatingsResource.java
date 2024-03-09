package com.example.ratingsservice.resources;

import com.example.ratingsservice.models.Rating;
import com.example.ratingsservice.models.UserRating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource{
	
	@Autowired
	 private RatingRepository ratingRepository;
	
	
	 @RequestMapping("/{userID}")
	    public UserRating getRatingsOfUser(@PathVariable String userID) {
	    		
	    	System.out.println("Request wsl "+ userID);
//	      List<Rating> ratings = Arrays.asList(
//	                new Rating("550", 4)
//	        );
		 
		  List<User_Ratings> ans = ratingRepository.findByUserID(userID);
//		  
		  List<Rating> ratings = new ArrayList();
		  
		  for(int i=0 ; i< ans.size();i++) {
			  Rating r = new Rating(ans.get(i).getMovieID() , ans.get(i).getRating());
			  ratings.add(r);
		  }
		  
	      return new UserRating(ratings);
	    }

	    
	    
}
