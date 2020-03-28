package com.example.moviecatalogservice.module;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class UserRating {
     private String userId;
     private List<Rating> ratings;

}