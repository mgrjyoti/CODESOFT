package com.codsoft.student;

public class StudentMain {

	public static void main(String[] args) {
   
        Course course1 = new Course("CS101", "Introduction to Programming", "Learn the basics of programming", 30);
        Course course2 = new Course("MATH202", "Calculus II", "Advanced calculus topics", 25);
        
        
        Student student1 = new Student("1001", "Alice");
        Student student2 = new Student("1002", "Bob");


        student1.registerCourse(course1);
        student2.registerCourse(course1);
        student2.registerCourse(course2);

        System.out.println("Course Listing:");
        System.out.println("1. " + course1.getTitle() + " (" + course1.getCourseCode() + ")");
        System.out.println("   Description: " + course1.getDescription());
        System.out.println("   Capacity: " + course1.getEnrolledStudents() + "/" + course1.getCapacity());

        System.out.println("2. " + course2.getTitle() + " (" + course2.getCourseCode() + ")");
        System.out.println("   Description: " + course2.getDescription());
        System.out.println("   Capacity: " + course2.getEnrolledStudents() + "/" + course2.getCapacity());
        
        
        System.out.println("\nStudent Registrations:");
        System.out.println(student1.getName() + " (" + student1.getStudentID() + "):");
        for (Course course : student1.getRegisteredCourses()) {
            System.out.println("- " + course.getTitle() + " (" + course.getCourseCode() + ")");
        }

        System.out.println(student2.getName() + " (" + student2.getStudentID() + "):");
        for (Course course : student2.getRegisteredCourses()) {
            System.out.println("- " + course.getTitle() + " (" + course.getCourseCode() + ")");
        }
    }
}
