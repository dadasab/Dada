package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {
	
	
	public HospitalServiceImpl() {

		System.out.println("Default const"+getClass().getSimpleName());
	}
	
	
	
	@Override
	public boolean validateAndSave(HospitalDTO dto) {

		// System.out.println("");
		int id = dto.getId();
		String name = dto.getName();
		String founder = dto.getFounder();
		int since = dto.getSince();
		String specialization = dto.getSpecialization();

		if (id > 0 && id < 80) {
			System.out.println("Id IS valid");
			if (name != null && name.length() > 1 && name.length() < 80) {
				System.out.println("name is valid");
				if (founder != null && founder.length() > 1 && founder.length() < 80) {
					System.out.println("founder is valid");
					if (since > 1900 && since < 2023) {
						System.out.println("since is valid");
						if (specialization != null && specialization.length() > 1 && specialization.length() < 80) {
							System.out.println("specialization iS valid");
							HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
							hospitalRepository.save(dto);
						} else {
							System.err.println("specialization is invalid");
						}
					} else {
						System.err.println("since is invalid");
					}

				} else {
					System.err.println("founder is invalid");
				}

			} else {
				System.err.println("name is invalid");
			}

		} else {
			System.err.println("id is invalid");
		}

		return false;
	}

}
