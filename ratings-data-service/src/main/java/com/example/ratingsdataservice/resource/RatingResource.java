package com.example.ratingsdataservice.resource;

import com.example.ratingsdataservice.module.Rating;
import com.example.ratingsdataservice.module.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId")String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }
}