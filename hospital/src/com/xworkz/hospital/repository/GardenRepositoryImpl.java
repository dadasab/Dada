package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	@Override
	public boolean save(GardenDTO gardenDTO) {

		System.out.println("Running save method to repository" +gardenDTO);
		
		return true;
	}

}
