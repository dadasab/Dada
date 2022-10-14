package com.xworkz.hospital;

import com.xworkz.hospital.dto.ProjectorDTO;
import com.xworkz.hospital.service.ProjectorService;
import com.xworkz.hospital.service.ProjectorServiceImpl;

public class ProjectorRunner {

	public static void main(String[] args) {

		ProjectorDTO projectorDTO= new ProjectorDTO(1, "Panasonic", 2001, "Grey", 2500);
		
		
		ProjectorService projectorService=new ProjectorServiceImpl();
		projectorService.validateAndSave(projectorDTO);
		
		
		
		
	}

}
