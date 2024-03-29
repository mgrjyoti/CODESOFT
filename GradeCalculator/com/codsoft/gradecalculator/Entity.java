package com.codsoft.gradecalculator;

public class Entity {

	private long id;
	private String schooleNmae;
	private String studName;
	private int rollNo;
	private String className;
	private double marks;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSchooleNmae() {
		return schooleNmae;
	}
	public void setSchooleNmae(String schooleNmae) {
		this.schooleNmae = schooleNmae;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
