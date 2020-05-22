package com.ilyasidorov.suremovies.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String body;
    private String imageSrc;

    @Temporal(TemporalType.DATE)
    private Date created;
}
