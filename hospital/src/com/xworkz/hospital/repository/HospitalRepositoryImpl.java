package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save methhod to repository " + dto);
		return true;
	}

}
