package com.two.service.impl;

import com.two.dao.CourseDao;
import com.two.dao.impl.CourseDaoImpl;
import com.two.entity.Course_avg;
import com.two.entity.Course_fail_rate;
import com.two.entity.Course_ranking;
import com.two.service.CourseService;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseDao cd = new CourseDaoImpl();
    @Override
    public List<Course_avg> selAllCourse_avg() {
        try {
            return cd.selAllCourse_avg();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Course_fail_rate> selAllCourse_fail_rate() {
        try {
            return cd.selAllCourse_fail_rate();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Course_ranking> selAllCourse_ranking() {
        int i = 1;
        List<Course_ranking> list = null;
        try {
            list = cd.selAllCourse_ranking();
            for (Course_ranking course_ranking : list) {
                course_ranking.setRanking(i++);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return list;
    }
}
