package com.two.entity;

public class Course_ranking{
	
	private String sno;//学号
	private String dname;//系名
	private String clname;//班名
	private String sname;//学生姓名
	private String ssex;//学生性别
	private int sage;//学生年龄
	private Double grade;//成绩
	private int ranking;//排名
	public Course_ranking() {
	}

	public Course_ranking(String sno, String dname, String clname, String sname, String ssex, int sage, Double grade, int ranking) {
		this.sno = sno;
		this.dname = dname;
		this.clname = clname;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.grade = grade;
		this.ranking = ranking;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Course_ranking{" +
				"sno='" + sno + '\'' +
				", dname='" + dname + '\'' +
				", clname='" + clname + '\'' +
				", sname='" + sname + '\'' +
				", ssex='" + ssex + '\'' +
				", sage=" + sage +
				", grade=" + grade +
				", ranking=" + ranking +
				'}';
	}
}
