package com.Chapter10.com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// ´´½¨Map
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "apple01");
		map.put("2", "apple02");
		map.put("3", "apple03");
		for (int i = 1; i <= 3; i++) {
			System.out.println("key:" + i + " " + "value:" + map.get("" + i + ""));
		}
	}

}
