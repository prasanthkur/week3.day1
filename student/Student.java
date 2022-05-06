package org.student;

import org.department.Department;

public class Student  extends Department{
	

	
	public void studentName()
	{
		System.out.println("Student name is Prhabakar");
	}
public void studentDept()
{
	System.out.println("Computer science");
	
}
public void studentId()
{
	System.out.println("Student id is 112");
}

public static void main(String[] args) {
	
	Student stud=new Student();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
	stud.departmentName();
	stud.studentName();
	stud.studentDept();
	stud.studentId();
}
}
