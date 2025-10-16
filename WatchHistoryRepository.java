package com.netflixtracker.netflix_tracker;

import com.netflixtracker.netflix_tracker.WatchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WatchHistoryRepository extends JpaRepository<WatchHistory, Long> {
    List<WatchHistory> findByUserUserId(Long userId);
    List<WatchHistory> findByMovieMovieId(Long movieId);
}