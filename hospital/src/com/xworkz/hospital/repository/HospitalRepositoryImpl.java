package com.xworkz.hospital.repository;

import java.sql.*;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.enumclass.MysqlDBCredential;


public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save methhod to repository " + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//load and register
			Connection connection = DriverManager.getConnection(MysqlDBCredential.URL.getvalues(),
					MysqlDBCredential.USERNAME.getvalues(), MysqlDBCredential.SECRATE.getvalues());//connction
			System.out.println(connection);
			String sql = "insert into hospital values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getSpecialization() + "','" + dto.getFounder() + "'," + dto.getSince() + ");";
			Statement statement = connection.createStatement();    //create statement
			int execute = statement.executeUpdate(sql);//execute statement
			if (execute > 0) {
				System.out.println("Genarated data  :" + sql);
				return true;

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
