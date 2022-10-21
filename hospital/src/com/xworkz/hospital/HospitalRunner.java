package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO = new HospitalDTO(1, "Jay Deva", "dyams", "cardiac", 1970);
		HospitalDTO hospitalDTO1 = new HospitalDTO(2, "Indraprasth Apollo", "Prathap C.Reddy", "Cancer", 1996);
		HospitalDTO hospitalDTO2 = new HospitalDTO(3, "Kokilaben Dhirubhai Ambani", "Ambani Foundation", "Neurologist",
				2006);
		HospitalDTO hospitalDTO3 = new HospitalDTO(4, "Bowring and lady curzon", "Dhaval Shah", "Thyrocare", 1890);
		HospitalDTO hospitalDTO4 = new HospitalDTO(5, "Cloudnine Hospitals", "R.Kishore Kumar", "neonatologist", 2007);
		HospitalDTO hospitalDTO5 = new HospitalDTO(6, "Narayana hrudayalay ", "Dr.Devi Shetty", "Cardiac Surgeon",
				2001);
		HospitalDTO hospitalDTO6 = new HospitalDTO(7, "Nimhans Hospital", "R.marthanda Varma", "Neurosurgeon", 1977);
		HospitalDTO hospitalDTO7 = new HospitalDTO(8, "Nethradhama Superspeciality Hospital", "Albert Schweitzer",
				"Anesthesiologyf", 2015);
		HospitalDTO hospitalDTO8 = new HospitalDTO(9, "Rajarajeswari Hospital", "A.C Shanmugam", "Neurosurgeon", 1992);
		HospitalDTO hospitalDTO9 = new HospitalDTO(10, "vanivilas Women and Children Hospital",
				"Bangalore Reasearch Center", "Specilast", 1935);
		HospitalDTO hospitalDTO10 = new HospitalDTO(11, "Acura Speciality Hospital", "Dr.Rajaram", "Diabets", 2000);
		HospitalDTO hospitalDTO11 = new HospitalDTO(12, "Aster CMI Hospital", "Azad Moopen", "Entrepenur", 1987);
		HospitalDTO hospitalDTO12 = new HospitalDTO(13, "Ayur Vaid Hospital", "Rajiv Vasudeva", "Ayur Veda", 2005);
		HospitalDTO hospitalDTO13 = new HospitalDTO(14, "Bangalore Baptist Hospital", "Dr.Jasper Mcphail", "Therpy",
				1973);
		HospitalDTO hospitalDTO14 = new HospitalDTO(15, "Bangalore Children’s Hospital", "Prathap C.Reddy", "Cancer",
				1996);
		HospitalDTO hospitalDTO15 = new HospitalDTO(16, "Bangalore Kidney Stone Hospital", "Prathap C.Reddy", "Cancer",
				1996);
		HospitalDTO hospitalDTO16 = new HospitalDTO(17, "Bangalore West Lions Hospital", "Prathap C.Reddy", "Cancer",
				1996);
		HospitalDTO hospitalDTO17 = new HospitalDTO(18, "Ramakrishna", "Veeresh", "Cardiac", 1990);
		HospitalDTO hospitalDTO18= new HospitalDTO(19, "Roshan", "Vijayanand", "General", 1986);
		HospitalDTO hospitalDTO19= new HospitalDTO(20, "Rotary", "Vinay", "Heart", 1985);
		HospitalDTO hospitalDTO20= new HospitalDTO(21, "Sahara", "Vishwanath", "Lever", 1987);
		HospitalDTO hospitalDTO21= new HospitalDTO(22, "Scan Point", "Ravindranath", "Lungs", 1996);
		HospitalDTO hospitalDTO22 = new HospitalDTO(23, "Seetha", "Swathi Krishnamurthi", "General", 2000);
		HospitalDTO hospitalDTO23 = new HospitalDTO(24, "Sharada", "Sudarshan", "Kidney", 2001);
		HospitalDTO hospitalDTO24 = new HospitalDTO(25, "Shyam", "Venkatesh", "Body", 2016);
		HospitalDTO hospitalDTO25 = new HospitalDTO(26, "Sindhu", "Prajwal", "Cardiac", 2008);
		HospitalDTO hospitalDTO26 = new HospitalDTO(27, "Sir M V", "Veerabhadrappa", "Skin", 1998);
		HospitalDTO hospitalDTO27 = new HospitalDTO(28, "Sri Danamma", "Ranganna", "Bone", 1997);
		HospitalDTO hospitalDTO28 = new HospitalDTO(29, "Sri Devi", "Radhika", "Cardiac", 1999);
		HospitalDTO hospitalDTO29 = new HospitalDTO(30, "Sri Manjunatha", "Manjanna", "General", 2000);
		HospitalDTO hospitalDTO30 = new HospitalDTO(31, "Sri Dharma", "Chetan", "Heart", 1987);
		HospitalDTO hospitalDTO31 = new HospitalDTO(32, "Sri Nava Ratna", "Chandranna", "Surgery", 1983);
		HospitalDTO hospitalDTO32 = new HospitalDTO(33, "Sri Raghava", "Rajanna", "Eye", 1984);
		HospitalDTO hospitalDTO33 = new HospitalDTO(34, "Sri Ram", "Siddappa", "Nose", 1988);
		HospitalDTO hospitalDTO34 = new HospitalDTO(35, "Sri Ranga", "Manjappa", "Ear", 1999);
		HospitalDTO hospitalDTO35 = new HospitalDTO(36, "Sri Sai", "Omkarappa", "Mouth", 1969);
		HospitalDTO hospitalDTO36 = new HospitalDTO(37, "Al Ameen", "Surappa", "Brain", 1998);
		HospitalDTO hospitalDTO37 = new HospitalDTO(38, "Bapuji", "Suresh", "Heart", 1962);
		HospitalDTO hospitalDTO38 = new HospitalDTO(39, "Chirag", "Yogesh", "General", 1996);
		HospitalDTO hospitalDTO39 = new HospitalDTO(40, "City Central", "Hanumanth", "Cardiac", 1995);
		HospitalDTO hospitalDTO40 = new HospitalDTO(41, "Davanagere Heart", "Suhas", "Lungs", 1988);
		HospitalDTO hospitalDTO41 = new HospitalDTO(42, "Guru Poly Clinic", "Sachin", "Cancer", 1972);
		HospitalDTO hospitalDTO42 = new HospitalDTO(43, "MS Dental", "Basavarajappa", "Cardiac", 2006);
		HospitalDTO hospitalDTO43 = new HospitalDTO(44, "Nadigar Dental", "Naresh", "Heartr", 2008);
		HospitalDTO hospitalDTO44 = new HospitalDTO(45, "Narayana Hrudayalaya", "Nagesh", "Cardiac", 2010);
		HospitalDTO hospitalDTO45 = new HospitalDTO(46, "Nayana Eye", "Nagappa", "General", 2018);
		HospitalDTO hospitalDTO46 = new HospitalDTO(47, "New Dental", "Kallesh", "Urology", 1990);
		HospitalDTO hospitalDTO47 = new HospitalDTO(48, "Sai Multi Speciality", "Bojanna", "Brain", 2012);
		HospitalDTO hospitalDTO48 = new HospitalDTO(49, "Sreedurga", "Vasu", "Cardiac", 1972);
		HospitalDTO hospitalDTO49 = new HospitalDTO(50, "SS Hospital", "Darshan", "Body", 2014);
		HospitalDTO hospitalDTO50 = new HospitalDTO(51, "Suchetana", "Palakshappa", "Physiotherapy", 2016);
		HospitalDTO hospitalDTO51 = new HospitalDTO(52, "Spandana Urology", "Krishnamurti", "Polyclinic", 2015);
		HospitalDTO hospitalDTO52 = new HospitalDTO(53, "Surbhi", "Suresh", "Cardiac", 2019);
		HospitalDTO hospitalDTO53 = new HospitalDTO(54, "Veeresh ENT", "Ragini", "Cardiac", 1998);
		HospitalDTO hospitalDTO54 = new HospitalDTO(55, "Sri Nivasa", "Sumadura", "Plastic surgery", 1993);
		HospitalDTO hospitalDTO55 = new HospitalDTO(56, "Thrombosis", "Divyakka", "Cardiac", 2000);
		HospitalDTO hospitalDTO56 = new HospitalDTO(57, "Ullal Gen", "Vidyakka", "Heart", 2002);
		HospitalDTO hospitalDTO57 = new HospitalDTO(58, "Uma Nursing", "Sushmakka", "Cancer", 2005);
		HospitalDTO hospitalDTO58 = new HospitalDTO(59, "1 Health Medical", "Malatesh", "Cardiac", 1994);
		HospitalDTO hospitalDTO59 = new HospitalDTO(60, "32 Smiles", "Manoj", "Cardiac", 1993);
		HospitalDTO hospitalDTO60 = new HospitalDTO(61, "A Dent care", "Nanu", "Hair", 2000);
		HospitalDTO hospitalDTO61 = new HospitalDTO(62, "A J Dental", "Byrappa", "Cardiac", 2006);
		
	
	
		HospitalDTO hospitalDTO62 = new HospitalDTO(63, "City Hospital", "K.Bhaskar", "dynamic surgeon", 1987);
		HospitalDTO hospitalDTO63 = new HospitalDTO(64, "D.G.Hospital", "D.G Benakappa", "Surgeon", 1930);
	
		HospitalDTO hospitalDTO64 = new HospitalDTO(65, "Basaveshwara General Hospital ", "Mahadevappa Rampure",
				"radiology", 1989);
		HospitalDTO hospitalDTO65 = new HospitalDTO(66, "Vydehi Hospital", "D.K Audikeshav naidu", " NeuroSurgey",
				2000);

		HospitalService hospitalService = new HospitalServiceImpl();
		hospitalService.validateAndSave(hospitalDTO);
		hospitalService.validateAndSave(hospitalDTO1);
		hospitalService.validateAndSave(hospitalDTO2);
		hospitalService.validateAndSave(hospitalDTO3);
		hospitalService.validateAndSave(hospitalDTO4);
		hospitalService.validateAndSave(hospitalDTO5);
		hospitalService.validateAndSave(hospitalDTO6);
		hospitalService.validateAndSave(hospitalDTO7);
		hospitalService.validateAndSave(hospitalDTO8);
		hospitalService.validateAndSave(hospitalDTO9);
		hospitalService.validateAndSave(hospitalDTO10);
		hospitalService.validateAndSave(hospitalDTO11);
		hospitalService.validateAndSave(hospitalDTO12);
		hospitalService.validateAndSave(hospitalDTO13);
		hospitalService.validateAndSave(hospitalDTO14);
		hospitalService.validateAndSave(hospitalDTO15);
		hospitalService.validateAndSave(hospitalDTO16);
		hospitalService.validateAndSave(hospitalDTO17);
		hospitalService.validateAndSave(hospitalDTO18);
		hospitalService.validateAndSave(hospitalDTO19);
		hospitalService.validateAndSave(hospitalDTO20);
		hospitalService.validateAndSave(hospitalDTO21);
		hospitalService.validateAndSave(hospitalDTO22);
		hospitalService.validateAndSave(hospitalDTO23);
		hospitalService.validateAndSave(hospitalDTO24);
		hospitalService.validateAndSave(hospitalDTO25);
		hospitalService.validateAndSave(hospitalDTO26);
		hospitalService.validateAndSave(hospitalDTO27);
		hospitalService.validateAndSave(hospitalDTO28);
		hospitalService.validateAndSave(hospitalDTO29);
		hospitalService.validateAndSave(hospitalDTO30);
		hospitalService.validateAndSave(hospitalDTO31);
		hospitalService.validateAndSave(hospitalDTO32);
		hospitalService.validateAndSave(hospitalDTO33);
		hospitalService.validateAndSave(hospitalDTO34);
		hospitalService.validateAndSave(hospitalDTO35);
		hospitalService.validateAndSave(hospitalDTO36);
		hospitalService.validateAndSave(hospitalDTO37);
		hospitalService.validateAndSave(hospitalDTO38);
		hospitalService.validateAndSave(hospitalDTO39);
		hospitalService.validateAndSave(hospitalDTO40);
		hospitalService.validateAndSave(hospitalDTO41);
		hospitalService.validateAndSave(hospitalDTO42);
		hospitalService.validateAndSave(hospitalDTO43);
		hospitalService.validateAndSave(hospitalDTO44);
		hospitalService.validateAndSave(hospitalDTO45);
		hospitalService.validateAndSave(hospitalDTO46);
		hospitalService.validateAndSave(hospitalDTO47);
		hospitalService.validateAndSave(hospitalDTO48);
		hospitalService.validateAndSave(hospitalDTO49);
		hospitalService.validateAndSave(hospitalDTO50);
		hospitalService.validateAndSave(hospitalDTO51);
		hospitalService.validateAndSave(hospitalDTO52);
		hospitalService.validateAndSave(hospitalDTO53);
		hospitalService.validateAndSave(hospitalDTO54);
		hospitalService.validateAndSave(hospitalDTO55);
		hospitalService.validateAndSave(hospitalDTO56);
		hospitalService.validateAndSave(hospitalDTO57);
		hospitalService.validateAndSave(hospitalDTO58);
		hospitalService.validateAndSave(hospitalDTO59);
		hospitalService.validateAndSave(hospitalDTO60);
		hospitalService.validateAndSave(hospitalDTO61);
		hospitalService.validateAndSave(hospitalDTO62);
		hospitalService.validateAndSave(hospitalDTO63);
		hospitalService.validateAndSave(hospitalDTO64);
		hospitalService.validateAndSave(hospitalDTO65);
		
	}

}
