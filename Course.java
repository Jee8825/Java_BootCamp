package com.example.studentinfo;

public class Course {

    private String courseId;
    private String title;

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Title: " + title);
    }

    public Course() {

    }

    public Course(String courseId, String title) {

        this.courseId = courseId;
        this.title = title;
    }
}
