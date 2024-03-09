package com.example.trendingservice.resources;

import com.example.trendingservice.models.Rating;
import com.example.trendingservice.models.UserRating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TrendingResource {

    @RequestMapping("/trending")
    public UserRating getRatingsOfUser() {
        List<Rating> ratings = Arrays.asList(
                new Rating("550", 4)
        );

        return new UserRating(ratings);
    }
}
