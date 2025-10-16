package com.netflixtracker.netflix_tracker;

import com.netflixtracker.netflix_tracker.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}