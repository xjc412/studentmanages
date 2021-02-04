package com.two.entity;

public class Course {
    private String cno;
    private String cname;
    private String cteacher;
    private Integer ccredit;

    public Course() {
    }

    public Course(String cno, String cname, String cteacher, Integer ccredit) {
        this.cno = cno;
        this.cname = cname;
        this.cteacher = cteacher;
        this.ccredit = ccredit;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public Integer getCcredit() {
        return ccredit;
    }

    public void setCcredit(Integer ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cteacher='" + cteacher + '\'' +
                ", ccredit=" + ccredit +
                '}';
    }
}
