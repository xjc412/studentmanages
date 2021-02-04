package com.two.test;

import com.two.entity.Course_avg;
import com.two.entity.Course_fail_rate;
import com.two.service.impl.CourseServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        CourseServiceImpl courseService = new CourseServiceImpl();
        List<Course_fail_rate> course_fail_rates = courseService.selAllCourse_fail_rate();
        for (Course_fail_rate course_fail_rate : course_fail_rates) {
            System.out.println(course_fail_rate);
        }

    }
}
