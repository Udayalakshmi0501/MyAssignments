package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name = Udayalakshmi.S");
	}
	public void studentDept() {
		System.out.println("Student Department = Textile Technology");
	}
	public void studentId() {
		System.out.println("Student Id = 2017309045");
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
		

	}

}
