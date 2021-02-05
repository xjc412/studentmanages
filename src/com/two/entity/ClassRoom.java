package com.two.entity;

public class ClassRoom {
    private String clno;
    private String clname;
    private String dno;

    public ClassRoom() {
    }

    public ClassRoom(String clno, String clname, String dno) {
        this.clno = clno;
        this.clname = clname;
        this.dno = dno;
    }

    public String getClno() {
        return clno;
    }

    public void setClno(String clno) {
        this.clno = clno;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "clno='" + clno + '\'' +
                ", clname='" + clname + '\'' +
                ", dno='" + dno + '\'' +
                '}';
    }
}
