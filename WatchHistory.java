package com.netflixtracker.netflix_tracker;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class WatchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long watchId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Temporal(TemporalType.TIMESTAMP)
    private Date watchDate = new Date();

    private Integer rating; // 1-5

    public WatchHistory() {}

    public Long getWatchId() { return watchId; }
    public void setWatchId(Long watchId) { this.watchId = watchId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }

    public Date getWatchDate() { return watchDate; }
    public void setWatchDate(Date watchDate) { this.watchDate = watchDate; }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }
}