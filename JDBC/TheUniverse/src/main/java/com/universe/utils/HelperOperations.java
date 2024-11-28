package com.universe.utils;

public class HelperOperations {

	public static String convertToSingular(String entity) {
		
		StringBuilder str = new StringBuilder("");
		
		if (entity.startsWith("the")) {
			if (entity.endsWith("ies")) {
				str.append(entity.substring(4, entity.length()-3));
				str.append("y");
			} else if (entity.endsWith("s")) {
				str.append(entity.substring(4, entity.length()-1));
			} else {
				str.append(entity.substring(4));
			}
		}
		
		return str.toString();
	}
	
}
