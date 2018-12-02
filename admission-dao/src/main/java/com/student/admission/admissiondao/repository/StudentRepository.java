package com.student.admission.admissiondao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.admission.admissiondao.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
