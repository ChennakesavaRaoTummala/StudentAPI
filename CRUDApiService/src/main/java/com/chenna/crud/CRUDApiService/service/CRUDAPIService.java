package com.chenna.crud.CRUDApiService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenna.crud.CRUDApiService.model.Student;
import com.chenna.crud.CRUDApiService.repository.CRUDAPIRepository;

@Service
public class CRUDAPIService {

	@Autowired
	private CRUDAPIRepository crudapiRepository;

	public Student getStudent(int studentId) {

		Optional<Student> student;
		student = crudapiRepository.findById(studentId);
		if (student.isPresent()) {
			return student.get();
		}
		return null;
	}

	public List<Student> getAllStudents() {

		Iterable<Student> students = crudapiRepository.findAll();
		List<Student> studentList = new ArrayList<>();
		for (Student student : students) {
			studentList.add(student);
		}
		return studentList;
	}

	public void createStudent(Student student) {
		crudapiRepository.save(student);
	}

	public void deleteStudent(int studentId) {
		crudapiRepository.deleteById(studentId);
	}
}
