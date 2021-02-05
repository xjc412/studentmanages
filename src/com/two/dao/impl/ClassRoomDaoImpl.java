package com.two.dao.impl;

import com.two.dao.ClassRoomDao;
import com.two.entity.ClassRoom;
import com.two.util.BaseDaoUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomDaoImpl extends BaseDaoUtil implements ClassRoomDao {
    @Override
    public List<ClassRoom> selectClassRoom() {
        String sql = "select * from class";
        Object[] obj = {};
        try {
            List<ClassRoom> list = this.selectData(sql, obj, ClassRoom.class);
            return list;
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

    /*@Override
    public int getDataCount() {
        String sql = "select count(1) from class";
        Object[] obj = {};
        int count = 0;
        ResultSet select = null;
        try {
            select = (ResultSet) this.selectData(sql, obj, ClassRoom.class);
            while (select.next()) {
                count = select.getInt("count(1)");
            }
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

        return count;
    }*/

    @Override
    public int deleteClassRoom(String clno) {
        String sql = "delete from class where clno = ?";
        Object[] obj = {clno};
        int i = 0;
        try {
            i = this.updateData(sql, obj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int resetDno(String clno) {
        String sql = "update class set dno = 201501 where clno = ?";
        Object[] obj = {clno};
        int i = 0;
        try {
            i = this.updateData(sql, obj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int addClassRoom(String clno, String clname, String dno) {
        String sql = "insert into class(clno, clname, dno) values(?, ?, ?)";
        Object[] obj = {clno, clname, dno};
        int i = 0;
        try {
            i = this.updateData(sql, obj);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

}
