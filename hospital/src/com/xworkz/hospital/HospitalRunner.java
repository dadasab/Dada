package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO = new HospitalDTO(1, "Jay Deva", "dyams", "cardiac", 1970);

		HospitalService hospitalService = new HospitalServiceImpl();
		hospitalService.validateAndSave(hospitalDTO);

		
	}

}
