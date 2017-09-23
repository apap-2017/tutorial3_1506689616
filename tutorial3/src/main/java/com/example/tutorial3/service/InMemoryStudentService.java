package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel student = null;
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getNpm().equals(npm)) {
				student = studentList.get(i);
			}
		}
		
		return student;
	}
	
	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public void deleteStudent(StudentModel student) {
		studentList.remove(student);
	}
}
