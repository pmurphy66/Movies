package com.heymurph.springboot.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heymurph.springboot.movies.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
