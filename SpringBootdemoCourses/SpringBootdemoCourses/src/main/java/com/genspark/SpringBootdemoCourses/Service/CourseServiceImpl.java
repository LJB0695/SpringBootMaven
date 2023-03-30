package com.genspark.SpringBootdemoCourses.Service;

import com.genspark.SpringBootdemoCourses.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(101, "Spring Framework", "Pradeep"));
        list.add(new Course(102, "Spring Boot", "Sukvider"));
        list.add(new Course(103, "Web Application", "Adam"));
    }

    @Override
    public List<Course> getAllCourses() {
        return list;
    }

    @Override
    public Course getCourseByID(int courseID) {
        Course c = null;

        for (Course course:list) {
            if(course.getCourseID()==courseID) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        String courseTitle = course.getCourseTitle();
        String courseInstructor = course.getCourseInstructor();
        Course c = null;
        for (Course course1: list) {
            if(course1.getCourseID()==course.getCourseID())
            {
                course1.setCourseTitle(courseTitle);
                course1.setCourseInstructor(courseInstructor);
                c = course1;
                break;
            }


        }
        return c;

    }

    @Override
    public String deleteCourseByID(int courseID) {
        for (Course course:list) {
            if(course.getCourseID()==courseID) {
                list.remove(course);
                break;
            }
        }
        return "Course was deleted successfully.";
    }
    }

