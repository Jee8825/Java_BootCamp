package com.example.studentinfo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MainAppConfig {

    // Define individual Course beans
    @Bean
    public Course course1() {
        return new Course("C101", "Spring Basics");
    }

    @Bean
    public Course course2() {
        return new Course("C102", "Data Structures");
    }

    @Bean
    public Course course3() {
        return new Course("C103", "Databases");
    }

    // Define a List of courses
    @Bean
    public List<Course> courses() {
        return Arrays.asList(course1(), course2(), course3());
    }

    // Define the Student bean and inject courses
    @Bean
    public Student student1() {
        return new Student("S001", "Amit", courses());
    }
}