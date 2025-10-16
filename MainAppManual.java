package com.example.studentinfo;

import java.util.ArrayList;
import java.util.List;

public class MainAppManual {
    public static void main(String[] args) {
        // Manually creating Course objects
        Course course1 = new Course("C101", "Spring Basics");
        Course course2 = new Course("C102", "Data Structures");
        Course course3 = new Course("C103", "Databases");

        // Manually creating a List of courses
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        // Manually creating a Student object with the courses
        Student student = new Student("S001", "Amit", courses);

        // Display student details
        student.showDetails();
    }
}