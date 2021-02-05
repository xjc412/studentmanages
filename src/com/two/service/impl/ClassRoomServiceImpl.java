package com.two.service.impl;

import com.two.dao.ClassRoomDao;
import com.two.dao.impl.ClassRoomDaoImpl;
import com.two.entity.ClassRoom;
import com.two.service.ClassRoomService;
import com.two.util.BaseDaoUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomServiceImpl extends BaseDaoUtil implements ClassRoomService {
    @Override
    public List<ClassRoom> selectClassRoom() {
        ClassRoomDao classRoomDao = new ClassRoomDaoImpl();
        List<ClassRoom> list = classRoomDao.selectClassRoom();
        return list;
    }

    @Override
    public int deleteClassRoom(String clno) {
        ClassRoomDao classRoomDao = new ClassRoomDaoImpl();
        return classRoomDao.deleteClassRoom(clno);
    }

    @Override
    public int resetDno(String clno) {
        ClassRoomDao classRoomDao = new ClassRoomDaoImpl();
        return classRoomDao.resetDno(clno);
    }

    @Override
    public List<ClassRoom> getClassRoomByClno(String clno) {
        String sql = "select * from class where clno = ?";
        Object[] obj = {clno};
        List<ClassRoom> list = new ArrayList<ClassRoom>();
        try {
            list = this.selectData(sql, obj, ClassRoom.class);
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
        return list;
    }

    @Override
    public int addClassRoom(String clno, String clname, String dno) {
        ClassRoomDao classRoomDao = new ClassRoomDaoImpl();
        return classRoomDao.addClassRoom(clno, clname, dno);
    }

    /*@Override
    public int getDataCount() {
        ClassRoomDao classRoomDao = new ClassRoomDaoImpl();
        int dataCount = classRoomDao.getDataCount();
        return dataCount;
    }*/
}
