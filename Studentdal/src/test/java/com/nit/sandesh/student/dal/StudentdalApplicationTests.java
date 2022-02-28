package com.nit.sandesh.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.sandesh.student.dal.entities.Student;
import com.nit.sandesh.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository repo;

	@Test
	void createStudent() {
		Student student= new Student();
		student.setName("sadesh");
		student.setCourse("java");
		student.setFee(30d);
		repo.save(student);
	}
	@Test
	void testFindStudentById() {
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student.setFee(40d);
		 repo.save(student);
	}
	@Test
	void testDeleteStudent() {
		Student student = repo.findById(1l).get();
		repo.delete(student);
	}

}
