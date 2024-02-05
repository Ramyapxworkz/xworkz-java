package com.xworkz.charger.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.charges.constants.ConnectionData;

public class ChargerMi2 {
	public static void main(String[] args) {
		String query=  "SELECT DISTINCT charger_brand FROM charger_table";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query);){
			  ResultSet resultSet5 = preparedStatement.executeQuery();
	            System.out.println("\nQuery 5:");
	            while (resultSet5.next()) {
	                System.out.println(resultSet5.getString("charger_brand"));
	            }

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
