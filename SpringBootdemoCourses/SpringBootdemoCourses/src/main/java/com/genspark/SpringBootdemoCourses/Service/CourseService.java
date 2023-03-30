package com.genspark.SpringBootdemoCourses.Service;

import com.genspark.SpringBootdemoCourses.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();
    Course getCourseByID(int courseID);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    String deleteCourseByID(int courseID);
}
