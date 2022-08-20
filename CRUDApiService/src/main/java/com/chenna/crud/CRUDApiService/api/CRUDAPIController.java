package com.chenna.crud.CRUDApiService.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenna.crud.CRUDApiService.model.Student;
import com.chenna.crud.CRUDApiService.service.CRUDAPIService;

@RestController
@RequestMapping("/crud-api/students")
@CrossOrigin
public class CRUDAPIController {

	@Autowired
	private CRUDAPIService crudapiService;

	@GetMapping
	public ResponseEntity<List<Student>> getStudentsInformation() {
		return new ResponseEntity<List<Student>>(crudapiService.getAllStudents(), HttpStatus.OK);
	}

	@GetMapping("{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable int studentId) {

		return new ResponseEntity<Student>(crudapiService.getStudent(studentId), HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {

		crudapiService.createStudent(student);
		return new ResponseEntity<String>("Created successfully..!", HttpStatus.CREATED);
	}

	@DeleteMapping("{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable int studentId) {

		crudapiService.deleteStudent(studentId);
		return new ResponseEntity<String>("Deleted successfully..!", HttpStatus.OK);
	}
}
