package com.chenna.crud.CRUDApiService.repository;

import org.springframework.data.repository.CrudRepository;

import com.chenna.crud.CRUDApiService.model.Student;

public interface CRUDAPIRepository extends CrudRepository<Student, Integer> {

}
