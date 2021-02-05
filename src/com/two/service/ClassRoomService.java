package com.two.service;

import com.two.entity.ClassRoom;

import java.util.List;

public interface ClassRoomService {
    public List<ClassRoom> selectClassRoom();
    /*public int getDataCount();*/
    public int deleteClassRoom(String clno);
    public int resetDno(String clno);
    public List<ClassRoom> getClassRoomByClno(String clno);
    public int addClassRoom(String clno, String clname, String dno);
}
