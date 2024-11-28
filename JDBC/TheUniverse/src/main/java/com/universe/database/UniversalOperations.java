package com.universe.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.universe.utils.HelperOperations;

/*
 * 
 * Tables and their fields in the_universe Database:
 * 
 * the_astronomical_scale:-
 * astronomical_scale_id (Integer)
 * astronomical_scale_name (String)
 * astronomical_scale_in_kilometers (String)
 * 
 * the_galaxies:-
 * galaxy_id (Integer)
 * galaxy_name (String)
 * 
 * the_planetary_systems:-
 * planetary_system_id (Integer)
 * planetary_system_name (String)
 * center_stars (String)
 * galaxy_id (Integers) references the_galaxies: galaxy_id
 * 
 * the_planets references the_planetary_systems:-
 * planet_id (Integer)
 * planet_name (String)
 * distance_from_the_center_stars_in_astronomical_units (Float)
 * planetary_system_id (Integer) references the_planetary_systems: planetary_system_id
 * 
 * the_moons references the_planets:-
 * moon_id (Integer)
 * moon_name (String)
 * planet_id (Integer) references the_planets: planet_id
 * 
 */

public class UniversalOperations {
	
	private static Connection connection;
	private static DatabaseMetaData metaData;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSetColumns;
	private static ResultSet resultSetRows;
	
	static {
		try {
			connection = UniversalConnection.getConnection();
			metaData = connection.getMetaData();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayAll(String entity) {
		String queryString = "SELECT * FROM " + entity;
		
		try {
			preparedStatement = connection.prepareStatement(queryString);
			resultSetRows = preparedStatement.executeQuery();
			
			resultSetColumns = metaData.getColumns(null, null, entity, null);
			while (resultSetColumns.next()) {
				System.out.printf("|%-24s", resultSetColumns.getString("COLUMN_NAME"));
			}
			System.out.println("|");
			
			while(resultSetRows.next()) {
				resultSetColumns = metaData.getColumns(null, null, entity, null);
				while (resultSetColumns.next()) {
					System.out.printf("|%-24s", resultSetRows.getString(resultSetColumns.getString("COLUMN_NAME")));
				}
				System.out.println("|");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayById(String entity, int entityId) {
		String formattedEntityId = HelperOperations.convertToSingular(entity) + "_id";
		String queryString = "SELECT * FROM " + entity + " WHERE " + formattedEntityId + " = ?";
		
		try {
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setInt(1, entityId);
			
			resultSetRows = preparedStatement.executeQuery();
			
			resultSetColumns = metaData.getColumns(null, null, entity, null);
			while (resultSetColumns.next()) {
				System.out.printf("|%-24s", resultSetColumns.getString("COLUMN_NAME"));
			}
			System.out.println("|");
			
			while(resultSetRows.next()) {
				resultSetColumns = metaData.getColumns(null, null, entity, null);
				while (resultSetColumns.next()) {
					System.out.printf("|%-24s", resultSetRows.getString(resultSetColumns.getString("COLUMN_NAME")));
				}
				System.out.println("|");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayByName(String entity, String entityName) {
		String formattedEntityName = HelperOperations.convertToSingular(entity) + "_name";
		String queryString = "SELECT * FROM " + entity + " WHERE " + formattedEntityName + " = ?";
		
		try {
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setString(1, entityName);
			
			resultSetRows = preparedStatement.executeQuery();
			
			resultSetColumns = metaData.getColumns(null, null, entity, null);
			while (resultSetColumns.next()) {
				System.out.printf("|%-24s", resultSetColumns.getString("COLUMN_NAME"));
			}
			System.out.println("|");
			
			while(resultSetRows.next()) {
				resultSetColumns = metaData.getColumns(null, null, entity, null);
				while (resultSetColumns.next()) {
					System.out.printf("|%-24s", resultSetRows.getString(resultSetColumns.getString("COLUMN_NAME")));
				}
				System.out.println("|");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayRelations(String entity1, String entity2) { // e.g. displayRelations("the_moons", "the_planets")
		String entityName1 = HelperOperations.convertToSingular(entity1) + "_name"; // e.g. moon_name
		String entityName2 = HelperOperations.convertToSingular(entity2) + "_name"; // e.g. planet_name
		String foreignKey = HelperOperations.convertToSingular(entity2) + "_id"; // e.g. planet_id
		
		String queryEntityName1 = entity1 + "." + entityName1; // e.g. the_moons.moon_name
		String queryEntityName2 = entity2 + "." + entityName2; // e.g. the_planets.planet_name
		String queryString = "SELECT " + queryEntityName1 + ", " + queryEntityName2 +
                " FROM " + entity1 +
                " INNER JOIN " + entity2 +
                " ON " + entity1 + "." + foreignKey +
                " = " + entity2 + "." + foreignKey;
//		e.g. SELECT the_moons.moon_name, the_planets.planet_name FROM the_moons INNER JOIN the_planets ON the_moons.planet_id = the_planets.planet_id
		
		try {
			preparedStatement = connection.prepareStatement(queryString);
			resultSetRows = preparedStatement.executeQuery();
			
			System.out.printf("|%-24s|%-24s", entityName1, entityName2);
			System.out.println("|");
			while(resultSetRows.next()) {
				System.out.printf("|%-24s|%-24s", resultSetRows.getString(1), resultSetRows.getString(2));
				System.out.println("|");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
