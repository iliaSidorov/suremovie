package com.ilyasidorov.suremovies.repository;

import com.ilyasidorov.suremovies.model.Movie;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long> {

    List<Movie> findByOrderByDateDesc();

    List<Movie> findAllByDirectorEquals(String director);

}
