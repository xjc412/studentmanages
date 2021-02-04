package com.two.dao.impl;

import com.two.dao.CourseDao;
import com.two.entity.Course_avg;
import com.two.entity.Course_fail_rate;
import com.two.entity.Course_ranking;
import com.two.util.BaseDaoUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class CourseDaoImpl extends BaseDaoUtil implements CourseDao {
    private BaseDaoUtil bdu = new BaseDaoUtil();
    @Override
    public List<Course_avg> selAllCourse_avg() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String sql = "select sc.cno cno,cname,avg(grade) avg from course,sc where course.cno = sc.cno group by cno order by cno";
        Object[] obj = {};
        return bdu.selectData(sql, obj, Course_avg.class);
    }

    @Override
    public List<Course_fail_rate> selAllCourse_fail_rate() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String sql = "select cno,(select cname from course where cno = x.cno) cname,cast(100.0*(select count(sno) from sc where grade < 60 and cno = x.cno)/(select count(sno) from sc where cno = x.cno) as decimal(18,2)) rate from sc x group by cno";
        Object[] obj = {};
        return bdu.selectData(sql, obj, Course_fail_rate.class);
    }

    @Override
    public List<Course_ranking> selAllCourse_ranking() throws InvocationTargetException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String sql = "select cno,student.sno,dname,clname,sname,ssex,sage,grade from department,class,student,sc where student.sno = sc.sno and class.clno = student.clno and department.dno = class.dno and cno = '1' order by grade desc";
        Object[] obj = {};
        return bdu.selectData(sql, obj, Course_ranking.class);
    }
}
