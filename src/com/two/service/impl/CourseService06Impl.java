package com.two.service.impl;

import com.two.dao.impl.CourseDaoimpl06;
import com.two.entity.Course;
import com.two.service.CourseService06;

import java.util.List;

public class CourseService06Impl implements CourseService06 {

    @Override
    public List<Course> selectAll(int pageNo , int pageSize) {
        CourseDaoimpl06 courseDaoimpl = new CourseDaoimpl06();
        List<Course> courses = courseDaoimpl.selectAll(pageNo, pageSize);
        return courses;

    }

    @Override
    public int getCount() {
        CourseDaoimpl06 courseDaoimpl = new CourseDaoimpl06();
        int count = courseDaoimpl.getCount();
        return count;
    }

    @Override
    public int delete(String id) {
        CourseDaoimpl06 courseDaoimpl = new CourseDaoimpl06();
        int delete = courseDaoimpl.delete(id);
        return delete;
    }

    @Override
    public int insert(String cno,String cname, String cteacher, Integer ccredit) {
        CourseDaoimpl06 courseDaoimpl = new CourseDaoimpl06();
        int insert = courseDaoimpl.insert(cno,cname, cteacher, ccredit);
        return insert;
    }

    @Override
    public List<Course> selectByCname(String cname) {
        CourseDaoimpl06 courseDaoimpl = new CourseDaoimpl06();
        List<Course> courses = courseDaoimpl.selectByCname(cname);
        return courses;
    }

    @Override
    public int update(String cname, String cteacher, Integer ccredit, String cno) {
        CourseDaoimpl06 courseDaoimpl = new CourseDaoimpl06();
        int update = courseDaoimpl.update(cname, cteacher, ccredit, cno);
        return update;
    }
}
