package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {
	
@Override
	public boolean save(PropertyDTO propertyDTO) {
		System.out.println("Running save method " +propertyDTO);
		return true;
	}

}
