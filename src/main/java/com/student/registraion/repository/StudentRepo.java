package com.student.registraion.repository;

import com.student.registraion.enitites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StudentRepo extends JpaRepository<Student, Serializable> {
}
