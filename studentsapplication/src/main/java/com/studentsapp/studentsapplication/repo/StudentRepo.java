package com.studentsapp.studentsapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.studentsapp.studentsapplication.entity.Student;
@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
