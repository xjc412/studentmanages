package com.two.test;

import com.two.dao.impl.ClassRoomDaoImpl;
import com.two.entity.ClassRoom;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ClassRoomDaoImpl classRoomDao = new ClassRoomDaoImpl();
        int i = classRoomDao.deleteClassRoom("20150302");
        System.out.println(i);
    }
}
