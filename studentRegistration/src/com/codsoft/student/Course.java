package com.codsoft.student;

public class Course {

	 private String courseCode;
	    private String title;
	    private String description;
	    private int capacity;
	    private int enrolledStudents;
		public String getCourseCode() {
			return courseCode;
		}
		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public int getEnrolledStudents() {
			return enrolledStudents;
		}
		public void setEnrolledStudents(int enrolledStudents) {
			this.enrolledStudents = enrolledStudents;
		}
		public Course(String courseCode, String title, String description, int capacity) {
			super();
			this.courseCode = courseCode;
			this.title = title;
			this.description = description;
			this.capacity = capacity;
			this.enrolledStudents = 0;
		}
		public boolean enrollStudent() {
	        if (enrolledStudents < capacity) {
	            enrolledStudents++;
	            return true;
	        } else {
	            return false;
	        }
			
		}
		 void dropStudent() {
			 enrolledStudents--;
			
		}
	    
}
