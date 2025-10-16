package com.netflixtracker.netflix_tracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final MovieRepository movieRepo;
    private final UserRepository userRepo;
    private final WatchHistoryRepository watchHistoryRepo;

    public ViewController(MovieRepository movieRepo, UserRepository userRepo, WatchHistoryRepository watchHistoryRepo) {
        this.movieRepo = movieRepo;
        this.userRepo = userRepo;
        this.watchHistoryRepo = watchHistoryRepo;
    }

    @GetMapping("/")
    public String home() {
        return "index"; // templates/index.html
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", movieRepo.findAll());
        return "movies"; // templates/movies.html
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "users"; // templates/users.html
    }

    @GetMapping("/watch-history")
    public String watchHistory(Model model) {
        model.addAttribute("history", watchHistoryRepo.findAll());
        return "watch-history"; // templates/watch-history.html
    }

    @GetMapping("/recommendations")
    public String recommendations(Model model) {
        model.addAttribute("recommendations", java.util.List.of());
        return "recommendations"; // templates/recommendations.html
    }
}