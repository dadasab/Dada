package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.GardenDTO;
import com.xworkz.hospital.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {
	
	public GardenServiceImpl() {

	System.out.println("created deafult const "+getClass().getSimpleName());
	
	}

	@Override
	public boolean validateAndSave(GardenDTO gardenDTO) {

		
		int id=gardenDTO.getId();
		String name=gardenDTO.getName();
		String location=gardenDTO.getLocation();
		int entryFees=gardenDTO.getEntryFees();
		double timing=gardenDTO.getTiming();
		
		if(id > 0 && id<20) {
			System.out.println("Id is valid");
			if(name!= null && name.length()>2 && name.length()<20) {
				System.out.println("name is valid");
				if(location!= null && location.length()>2 && location.length()<20) {
					System.out.println("location is valid");
					if(entryFees>0 && entryFees<100) {
						System.out.println("entryFees is valid");
						if(timing>10.30 && timing<12.30) {
							System.out.println("timing is valid");
							GardenRepositoryImpl gardenRepositoryImpl=new GardenRepositoryImpl();
							gardenRepositoryImpl.save(gardenDTO);
						}
						else {
							System.err.println("timing is invalid");
						}
					}
					else {
						System.err.println("entryFees is invalid");
					}
				}
				else {
					System.err.println("name is invalid");
				}
			}
			else {
				System.err.println("name is invalid");
			}
		}
		else {
			System.err.println("id is invalid");
		}
		
		return false;
	}

}
