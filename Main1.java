package com.main1;

import com.school1.School;
import com.student.Student;

public class Main1 {
public static void main(String[] args) {
	School schoolObject = School.getschoolObject("Zphs","cumbum","Girls Eduaction");
	Student studentObject = Student.getStudentObject("Jyothi", "A", schoolObject, 93);
	if(schoolObject==null && studentObject==null) {
		System.out.println("Enter all the details properly");
	}
	else {
		System.out.println(schoolObject);
		System.out.println(studentObject);
	}
}
}