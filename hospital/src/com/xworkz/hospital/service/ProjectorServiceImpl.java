package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.ProjectorDTO;
import com.xworkz.hospital.repository.ProjectorRepository;
import com.xworkz.hospital.repository.ProjectorRepositoryImpl;
import com.xworkz.hospital.repository.PropertyRepository;

public class ProjectorServiceImpl implements ProjectorService {

	@Override
	public boolean validateAndSave(ProjectorDTO projectorDTO) {

		int id=projectorDTO.getId();
		String companyName=projectorDTO.getCompanyName();
		int launched=projectorDTO.getLaunched();
		String color=projectorDTO.getColor();
		int price=projectorDTO.getPrice();
		
		if(id>0 && id<6) {
			System.out.println("id is valid");
			if(companyName!=null && companyName.length()>2 && companyName.length()<20) {
				System.out.println("companyName is valid");
				if(launched>2000 && launched<2023) {
					System.out.println("launched is valid");
					if(color!=null && color.length()>2 && color.length()<20) {
						System.out.println("color is valid");
						if(price>500 && price<6000) {
							System.out.println("price is valid");
							ProjectorRepository projectorRepository=new ProjectorRepositoryImpl();
							projectorRepository.save(projectorDTO);
						}else {
							System.out.println("price is invalid");
						}
					}else {
						System.out.println("color is in valid");
					}
				}else {
					System.out.println("launched is in valid");
				}
			}else {
				System.out.println("companyName is invalid");
			}
		}else {
			System.out.println("id is invalid");
		}
		
		return false;
	}

}
