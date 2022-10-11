package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.dto.HouseDTO;
import com.xworkz.enums.OwningType;
import com.xworkz.enums.Type;

public class HouseKnowledge {

	public static void main(String[] args) {

		HouseDTO houseDTO1 = new HouseDTO(1, "Shriram Infinity Apartment", "ShriRamFianance", Type.INDIVIDUAL, 29, true,
				OwningType.RENT, 1000.0d);
		HouseDTO houseDTO2 = new HouseDTO(3, "Parichatha Apartment", "Parvathi kR", Type.VILLA, 15, true,
				OwningType.RENT, 2000.0d);
		HouseDTO houseDTO3 = new HouseDTO(2, "Neo Town Apartment ", "NeoPvt ltd", Type.APARTMENT, 30, false,
				OwningType.RENT, 1000.0d);
		HouseDTO houseDTO4 = new HouseDTO(4, "ShoBha Apartment", "Shobha group", Type.APARTMENT, 40, true,
				OwningType.RENT, 3000.0d);
		HouseDTO houseDTO5 = new HouseDTO(5, "Ganesh Apartment", "Navarekar", Type.APARTMENT, 10, false,
				OwningType.RENT, 500.0d);
		HouseDTO houseDTO6 = new HouseDTO(6, "Shantikala Apartment", "Chandra Chuda", Type.APARTMENT, 4, true,
				OwningType.RENT, 700.0d);
		HouseDTO houseDTO7 = new HouseDTO(7, "Rajkumar Apartment", "Kumar Family", Type.APARTMENT, 9, true,
				OwningType.RENT, 8000.0d);
		HouseDTO houseDTO8 = new HouseDTO(8, "Brundavan Apartment", "Shetty BR", Type.APARTMENT, 10, false,
				OwningType.RENT, 10000.0d);
		HouseDTO houseDTO9 = new HouseDTO(9, "Silicon Apartment", "Christiano Ronaldo", Type.APARTMENT, 20, true,
				OwningType.RENT, 9000.0d);
		HouseDTO houseDTO10 = new HouseDTO(10, "Square Apartment", "Siddramayya", Type.APARTMENT, 20, true,
				OwningType.RENT, 32000.0d);
		HouseDTO houseDTO11 = new HouseDTO(11, "DevaDhota Apartment", "Goudra family", Type.APARTMENT, 20, true,
				OwningType.RENT, 7000.0d);
		HouseDTO houseDTO12 = new HouseDTO(12, "Mahakali Apartment", "Bihari Babu", Type.APARTMENT, 10, false,
				OwningType.RENT, 1000.0d);
		HouseDTO houseDTO13 = new HouseDTO(13, "Jain Villa", "Mallinath", Type.APARTMENT, 6, true, OwningType.RENT,
				1000.0d);
		HouseDTO houseDTO14 = new HouseDTO(14, "Dsouza Villa", "Roystan", Type.APARTMENT, 10, true, OwningType.RENT,
				1000.0d);
		HouseDTO houseDTO15 = new HouseDTO(15, "Garden Villa", "Pratap simha", Type.APARTMENT, 12, false,
				OwningType.RENT, 1000.0d);
		HouseDTO houseDTO16 = new HouseDTO(16, "Chalukya Apartment", "Shivaraj", Type.APARTMENT, 4, true,
				OwningType.RENT, 300.0d);
		HouseDTO houseDTO17 = new HouseDTO(17, "Reddy House", "Nagendra R", Type.INDIVIDUAL, 4, true, OwningType.RENT,
				800.0d);
		HouseDTO houseDTO18 = new HouseDTO(18, "DS Max Apartment", "Max Group ", Type.APARTMENT, 8, false,
				OwningType.RENT, 700.0d);
		HouseDTO houseDTO19 = new HouseDTO(19, "Nagavali House", "Kumar K", Type.INDIVIDUAL, 7, true, OwningType.RENT,
				300.0d);
		HouseDTO houseDTO20 = new HouseDTO(20, "Dyams Villa", "Dyamanna", Type.VILLA, 5, true, OwningType.RENT,
				3400.0d);

		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO11);
		houseDTOs.add(houseDTO12);
		houseDTOs.add(houseDTO13);
		houseDTOs.add(houseDTO14);
		houseDTOs.add(houseDTO15);
		houseDTOs.add(houseDTO16);
		houseDTOs.add(houseDTO17);
		houseDTOs.add(houseDTO18);
		houseDTOs.add(houseDTO19);
		houseDTOs.add(houseDTO20);

		houseDTOs.stream().sorted((d1, d2) -> {
			return Integer.compare(d1.getId(), d2.getId());
		}).forEach((e) -> System.out.println(e));

		System.out.println("===============================");
		houseDTOs.stream().sorted((d1, d2) -> {
			return Integer.compare(d2.getId(), d1.getId());
		}).forEach((e) -> System.out.println(e));

		System.out.println("=========================ascending name===========================");

		houseDTOs.stream().sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
				.forEach((e) -> System.out.println(e));
		System.out.println("=================descending type========================================");
		houseDTOs.stream().sorted((d1, d2) -> d2.getType().compareTo(d1.getType()))
				.forEach((e) -> System.out.println(e));
		System.out.println("===========================descending sqfeet================================");
		houseDTOs.stream().sorted((d1, d2) -> d2.getSqFeet().compareTo(d1.getSqFeet()))
				.forEach((d) -> System.out.println(d));
		;
		System.out.println("=========================loan and sort owner descending================");
		houseDTOs.stream().filter((ref) -> ref.getLoan()).sorted((c1, c2) -> c2.getOwner().compareTo(c1.getOwner()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("========================withut loan and owner descending=============================");
		houseDTOs.stream().filter((ref) -> ref.getLoan() == false)
				.sorted((c1, c2) -> c2.getOwner().compareTo(c1.getOwner())).forEach(ref -> System.out.println(ref));

		System.out.println("=============================Owning type LEASE======================================");
		houseDTOs.stream().filter((d) -> d.getOwningType() == OwningType.LEASE).forEach((d) -> System.out.println(d));
		System.out.println(
				"==============================type by appartment============================================");
		houseDTOs.stream().filter((e) -> e.getType() == Type.APARTMENT).forEach((e) -> System.out.println(e));
		System.out.println("============================type by villa================================================");
		houseDTOs.stream().filter((e) -> e.getType() == Type.VILLA).forEach((e) -> System.out.println(e));
		System.out.println(
				"===============================order by type and asc by owningtype==================================");
		houseDTOs.stream().sorted((r, r2) -> {
			int m = r.getType().compareTo(r2.getType());
			if (m == 0) {
				return r.getOwningType().compareTo(r2.getOwningType());

			}
			return m;
		}).forEach((ref) -> System.out.println(ref));
		System.out.println(
				"=================================order by name and desc by id=================================");
		houseDTOs.stream().sorted((r, r2) -> {
			int m = r2.getName().compareTo(r.getName());
			if (m == 0) {
				return r2.getId().compareTo(r.getId());

			}
			return m;
		}).forEach((ref) -> System.out.println(ref));

	}

}