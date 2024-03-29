package com.codsoft.student;

import java.util.List;

public class Student {

		private String studentID;
	    private String name;
	    private List<Course> registeredCourses;
	    
		public Student(String studentID, String name) {
			super();
			this.studentID = studentID;
			this.name = name;
		}
		public List<Course> getRegisteredCourses() {
			return registeredCourses;
		}
		public void setRegisteredCourses(List<Course> registeredCourses) {
			this.registeredCourses = registeredCourses;
		}
		public String getStudentID() {
			return studentID;
		}
		public String getName() {
			return name;
		}

	    public void registerCourse(Course course) {
	        registeredCourses.add(course);
	        course.enrollStudent();
	    }

	    public void dropCourse(Course course) {
	        registeredCourses.remove(course);
	        course.dropStudent();
	    }
	    
}
