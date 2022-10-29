package com.greatLearning.studentManagement.dao;

import java.util.List;

import com.greatLearning.studentManagement.entity.Student;


public interface StudentDao {
	public void saveStudent(Student student);
	public Student findById(int id);
	public List<Student>findAll();
	public void deleteStudent(int id);
	public List<Student>search(String name,String department);

}
