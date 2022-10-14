package com.xworkz.hospital;

import com.xworkz.hospital.dto.PropertyDTO;
import com.xworkz.hospital.service.PropertyService;
import com.xworkz.hospital.service.PropertyServiceImpl;

public class PropertyRunner {

	public static void main(String[] args) {

		
		
		PropertyDTO propertyDTO=new PropertyDTO(1, "Basavaraj", 84, 350, 2500);
		
		
		PropertyService propertyService=new PropertyServiceImpl();
		propertyService.validateAndSave(propertyDTO);
	}

}
