package com.ilyasidorov.suremovies.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private String country;
    private int year;
    private String imdb;
    private String popupTitle;
    private String popupDescription;

    @Temporal(TemporalType.DATE)
    private Date date;




}
