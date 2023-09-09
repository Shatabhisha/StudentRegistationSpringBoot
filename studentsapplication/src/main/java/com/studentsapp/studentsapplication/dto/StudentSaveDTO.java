package com.studentsapp.studentsapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentSaveDTO {
	private int studentid;
    public String studentname;
    private String address;
    private int  mobile;
    private boolean  active;
	

	
	
}
