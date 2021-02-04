package com.two.service;


import com.two.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> selectAll(int pageNo, int PageSize);
    public int getCount();
    public int delete(String id);
    public int insert(String con,String cname, String cteacher, Integer ccredit);
    public List<Course> selectByCname(String cname);
    public int update(String cname, String cteacher, Integer ccredit, String cno);
}

