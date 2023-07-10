package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch10_배열.Customer;

public class MapList {
	
//	public static void main(String[] args) {
//		List<Map<String, Object>> customers = new ArrayList<>();
//		
//		Map<String, Object> userList = new  HashMap<>();
//		userList.put("name", "홍길동");
//		userList.put("rating", "vip");
//		
//		for (Map<String, Object> customer : customers) {
//			System.out.println(userList.get("송유나"));
//		}
//	}
	
	public static void main(String[] args) {
		List<String> colors = null;
		List<String> sizes = null;
		
		Map<String, List<String>> options = new HashMap<>();
		
		List<String> List = new List(List<String>);
		
		List.add("red");
		List.add("green");
		List.add("blue");
		
		System.out.println(options);
		
		for (Map.Entry<String, List<String>> entry : options.entrySet()) {
			
		}
	}
	
}
