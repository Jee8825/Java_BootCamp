package com.netflixtracker.netflix_tracker;

import com.netflixtracker.netflix_tracker.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}