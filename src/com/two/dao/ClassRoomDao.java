package com.two.dao;

import com.two.entity.ClassRoom;

import java.util.List;

public interface ClassRoomDao {
    public List<ClassRoom> selectClassRoom();
    /*public int getDataCount();*/
    public int deleteClassRoom(String clno);
    public int resetDno(String clno);
    public int addClassRoom(String clno, String clname, String dno);
}
