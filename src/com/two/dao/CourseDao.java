package com.two.dao;

import com.two.entity.Course_avg;
import com.two.entity.Course_fail_rate;
import com.two.entity.Course_ranking;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface CourseDao {
    List<Course_avg> selAllCourse_avg() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException;
    List<Course_fail_rate> selAllCourse_fail_rate() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException;
    List<Course_ranking> selAllCourse_ranking() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException;
}
