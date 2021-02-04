package com.two.service;

import com.two.entity.Course_avg;
import com.two.entity.Course_fail_rate;
import com.two.entity.Course_ranking;

import java.util.List;

public interface CourseService {
    List<Course_avg> selAllCourse_avg();
    List<Course_fail_rate> selAllCourse_fail_rate();
    List<Course_ranking> selAllCourse_ranking();
}
