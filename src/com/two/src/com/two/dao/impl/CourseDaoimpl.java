package com.two.dao.impl;

import com.two.dao.CourseDao;
import com.two.entity.Course;
import com.two.util.BaseDaoUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class CourseDaoimpl extends BaseDaoUtil implements CourseDao {

    @Override
    public List<Course> selectAll(int pageNo,int pageSize) {
        String sql="select * from course limit ?,?";

        List<Course> select = null;
        Object[] objects={(pageNo - 1) * pageSize,pageSize};
        try {
            select = this.selectData(sql, objects, Course.class);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return select;
    }

    @Override
    public int getCount() {
     String sql="select * from course";
        try {
            List<Course> select = this.selectData(sql, null, Course.class);
            return select.size();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
           return 0;
    }

    @Override
    public int delete(String id) {
        String sql="delete from course where cno=?";
        Object[] objects={id};
        try {
            int update = this.updateData(sql, objects);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return 0;
    }

    @Override
    public int insert( String cno,String cname, String cteacher, Integer ccredit) {
        String sql="insert into course(cno,cname,cteacher,ccredit) values(?,?,?,?)";
        Object[] objects={cno,cname,cteacher,ccredit};
        try {
            int update = this.updateData(sql, objects);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Course> selectByCname(String cname) {
        String sql="select * from course where cname=?";
        Object[] objects={cname};
        try {
            List<Course> select = this.selectData(sql, objects, Course.class);
            return select;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int update(String cname, String cteacher, Integer ccredit, String cno) {
        String sql="update course set cname=?,cteacher=?,ccredit=? where cno=?";
        Object[] objects={cname,cteacher,ccredit,cno};
        try {
            int update = this.updateData(sql, objects);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return 0;
    }


}
