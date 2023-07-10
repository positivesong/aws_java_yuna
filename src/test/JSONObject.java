package test;

import java.util.HashMap;

public class JSONObject {
	public static void main(String[] args) {
		
		HashMap<String, Object> objectMap = new HashMap<>();
		objectMap.put("companyId", 100);
		objectMap.put("companyName", "Apples");
		objectMap.put("address", "Apple Computer Inc. 1 infinite Loop");
		objectMap.put("city", "Cupertino");
		objectMap.put("state", "CA");
		objectMap.put("zipCode", "95014");
		
		System.out.println(objectMap);
		
	}
}
