package com.jdbc.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/family", "root",
					"root"); Statement statement = connection.createStatement();) {

//				ResultSet resultSet1 = statement
//						.executeQuery("SELECT CustomerId, FirstName, Address, Fax, Email, SupportRepId\r\n"
//								+ "FROM Customer\r\n" + "WHERE CustomerId=6;");

				ResultSet resultSet = statement.executeQuery(
						"SELECT CustomerId, FirstName, Address, Fax, Email, SupportRepId\r\n" + "FROM Customer;");
				ResultSetMetaData metaData = resultSet.getMetaData(); // Getting Column name

				while (resultSet.next()) {
					System.out.println(metaData.getColumnLabel(1) + ": " + resultSet.getInt(1) + " | "
							+ metaData.getColumnLabel(2) + ": " + resultSet.getString(2) + " | "
							+ metaData.getColumnLabel(3) + ": " + resultSet.getString(3) + " | "
							+ metaData.getColumnLabel(4) + ": " + resultSet.getString(4) + " | "
							+ metaData.getColumnLabel(5) + ": " + resultSet.getString(5) + " | "
							+ metaData.getColumnLabel(6) + ": " + resultSet.getInt(6));

				}
//				while (resultSet1.next()) {
//					System.out.println(resultSet1.getInt(1) + " " + resultSet1.getString(2) + " "
//							+ resultSet1.getString(3) + " " + resultSet1.getString(4) + " " + resultSet1.getString(5)
//							+ " " + resultSet1.getInt(6));
//				}

//				resultSet1 = statement.executeQuery("SELECT SALARY FROM job");
//				while (resultSet1.next()) {
//					System.out.println(resultSet1.getInt(1));
//				}
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
