package com.inditex.videoclub_springboot.model;

import lombok.Data;

@Data
public class films {
    private Long id;
    private String title;
    private String genre;
    private int anio;
    private String synopsis;
    private String imageURL;
    private String director;
    private double rating;
}
