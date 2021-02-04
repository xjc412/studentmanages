package com.two.entity;

public class Course_avg{
	
	private String cno;//课程号
	private String cname;//课程名称
	private double avg;//平均分

	public Course_avg() {
	}

	public Course_avg(String cno, String cname, double avg) {
		this.cno = cno;
		this.cname = cname;
		this.avg = avg;
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

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Course_avg{" +
				"cno='" + cno + '\'' +
				", cname='" + cname + '\'' +
				", avg=" + avg +
				'}';
	}
}
