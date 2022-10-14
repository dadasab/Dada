package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO garageDTO) {

		System.out.println("Running save method " +garageDTO);
		
		return false;
	}
	
	

}
