package com.heymurph.springboot.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heymurph.springboot.movies.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Integer> {

}
