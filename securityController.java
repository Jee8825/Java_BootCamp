package com.example.security;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityController {
    @GetMapping("")
    public String security(HttpServletRequest request){
        return "Love? Sincerity? Compassion? Trust? I no longer buy into such illusions. After all, Even if you believe with all your hearts, even if you wait patiently at the crossroads. The one you're waiting for may have long since forgotten you. Forgotten the promise they swear to Keep. I waited... for a long time. I won't wait anymore.\n" +
                "What was once an unforgettable encounter between us, can now be the thread that weave a paradise for them. ";
    }
}
