package com.studentsapp.studentsapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentsapp.studentsapplication.service.StudentService;
import com.studentsapp.studentsapplication.dto.StudentSaveDTO;
import com.studentsapp.studentsapplication.entity.Student;
import com.studentsapp.studentsapplication.repo.StudentRepo;

@Service
public class StudentIMPL implements StudentService{
	@Autowired
	private StudentRepo studentRepo;
	@Override
	public String addStudent(StudentSaveDTO studentSaveDTO) {
		
		Student student = new Student(
				StudentSaveDTO.getStudentname(),
				StudentSaveDTO.getAddress(),
				StudentSaveDTO.getMobile(),
				StudentSaveDTO.isActive()	
		);
				
		studentRepo.save(student);
		
		return student.getStudentname();
	}
}
