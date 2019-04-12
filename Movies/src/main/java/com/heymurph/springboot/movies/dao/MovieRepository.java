package com.heymurph.springboot.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heymurph.springboot.movies.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
