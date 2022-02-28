package com.nit.sandesh.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.nit.sandesh.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
