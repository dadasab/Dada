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
public class GarageDTO {
	
	private int id;
	private String ownerName;
	private String garageName;
	private String areaName;
	private int servicePrice;
	

}
