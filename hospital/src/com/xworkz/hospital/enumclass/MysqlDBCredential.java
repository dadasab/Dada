package com.xworkz.hospital.enumclass;

public enum MysqlDBCredential {

	URL("jdbc:mysql://localhost:3306/jdbc"), USERNAME("root"), SECRATE("Xworkzodc@123");

	private String values;

	private MysqlDBCredential(String values) {
		this.values = values;

	}

	public String getvalues() {
		return values;

	}

}
