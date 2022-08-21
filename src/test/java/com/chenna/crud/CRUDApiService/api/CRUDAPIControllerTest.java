package com.chenna.crud.CRUDApiService.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.chenna.crud.CRUDApiService.model.Student;
import com.chenna.crud.CRUDApiService.service.CRUDAPIService;

@ExtendWith(MockitoExtension.class)
public class CRUDAPIControllerTest {

	@InjectMocks
	private CRUDAPIController cRUDAPIController;

	@Mock
	private CRUDAPIService cRUDAPIService;

	@Test
	public void testGetStudentSuccess() {

		Student student = new Student();
		student.setFirstName("testName");
		Mockito.when(cRUDAPIService.getStudent(Mockito.anyInt())).thenReturn(student);
		ResponseEntity<Student> response = cRUDAPIController.getStudent(1);
		assertNotNull(response);
	}
}
