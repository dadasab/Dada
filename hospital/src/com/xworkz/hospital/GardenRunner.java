package com.xworkz.hospital;

import com.xworkz.hospital.dto.GardenDTO;
import com.xworkz.hospital.service.GardenService;
import com.xworkz.hospital.service.GardenServiceImpl;

public class GardenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GardenDTO gardenDTO=new GardenDTO(1, "Sai Garden", "Micro Layout", 10, 10.40);
		
		GardenService gardenService=new GardenServiceImpl();
		gardenService.validateAndSave(gardenDTO);

	}

}
