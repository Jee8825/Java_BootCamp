package com.netflixtracker.netflix_tracker;

import com.netflixtracker.netflix_tracker.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findByUserUserId(Long userId);
}