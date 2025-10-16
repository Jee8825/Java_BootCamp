package com.example.studentinfo;

import java.util.List;

public class Student {

    private String studentId;
    private String name;
    private List<Course> courses; // Dependency

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student() {

    }

    public Student(String studentId, String name, List<Course> courses) {
        super();
        this.studentId = studentId;
        this.name = name;
        this.courses = courses;
    }

    public void showDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : courses) {
            c.display();
            System.out.println("---");
        }
    }
} /**public Student(String s001, String amit, List<Course> courses) {

    }

    public void showDetails() {
    }**/




