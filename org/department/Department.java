package org.department;

import org.college.College;

public class Department extends College {
	
	public void deptName() {
		System.out.println("Department Name = Textile Technology");
	}
	

	public static void main(String[] args) {

		Department dept = new Department();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		dept.deptName();

	}

}
