package com.example.moviecatalogservice.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CatalogItem {
    private String name;
    private String desc;
    private int rating;
}
