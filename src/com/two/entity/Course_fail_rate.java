package com.two.entity;
public class Course_fail_rate{
	private String cno;//课程号
	private String cname;//课程名称
	private double rate;//不及格率

	public Course_fail_rate() {
	}

	public Course_fail_rate(String cno, String cname, double rate) {
		this.cno = cno;
		this.cname = cname;
		this.rate = rate;
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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Course_fail_rate{" +
				"cno='" + cno + '\'' +
				", cname='" + cname + '\'' +
				", rate=" + rate +
				'}';
	}
}
