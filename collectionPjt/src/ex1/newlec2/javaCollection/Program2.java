package ex1.newlec2.javaCollection;

import java.util.HashMap;
import java.util.Map;

/*
 * 1. HashedMap
 * */
public class Program2 {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 1);
		map.put("title", "Hello World");
		map.put("hit", 12);
		
		String title = (String) map.get("title");
		System.out.println(title);
	}

}
