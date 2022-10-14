package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.PropertyDTO;
import com.xworkz.hospital.repository.PropertyRepository;
import com.xworkz.hospital.repository.PropertyRepositoryImpl;

public class PropertyServiceImpl implements PropertyService {
	 public PropertyServiceImpl() {

	 System.out.println("Default const"+getClass().getSimpleName());
	 
	 }

	@Override
	public boolean validateAndSave(PropertyDTO propertyDTO) {
		System.out.println("Running validate");
		int id=propertyDTO.getId();
		String ownerName=propertyDTO.getOwnerName();
		int siteNo=propertyDTO.getSiteNo();
		double sqFeet=propertyDTO.getSqFeet();
		int price=propertyDTO.getPrice();
		
		if(id>0 && id<5) {
			System.out.println("id is valid");
			if(ownerName!=null && ownerName.length()>3 && ownerName.length()<20 ) {
				System.out.println("ownerName is valid");
				if(siteNo>10 && siteNo<500) {
					System.out.println("siteno is valid");
					if(sqFeet>200.0 && sqFeet<1200.0) {
						System.out.println("sqfeet is valid");
						if(price>2000 && price<8000) {
							System.out.println("price is valid");
							PropertyRepository propertyRepository=new PropertyRepositoryImpl();
							propertyRepository.save(propertyDTO);
						}else {
							System.out.println("price is invalid");
						}
					}else {
						System.out.println("sqfeet is in valid");
					}
				}else {
					System.out.println("siteno is invalid");
				}
			}else {
				System.out.println("ownerName is in valid");
			}
		}else {
			System.out.println("id is invalid");
		}
		
		return false;
	}

}
