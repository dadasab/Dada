package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	@Override
	public boolean save(ProjectorDTO projectorDTO) {
      System.out.println("Running ProjectorRepositoryImpl "+projectorDTO);
		return false;
	}

}
