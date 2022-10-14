package com.xworkz.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GardenDTO {
	
	
	private int id;
	private String name;
	private String location;
	private int entryFees;
	private double timing;
	
	

}
