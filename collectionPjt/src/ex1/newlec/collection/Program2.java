package ex1.newlec.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 1. ArrayList
 * */
public class Program2 {

	public static void main(String[] args) {
		
//		GList<Integer> list = new GList<>();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list.get(2));
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(6);
		set.add(6);
		// 아래 결과는 4, 이미 있는 값은 받아지지 않는다.
		
		System.out.println(set.add(6));
		System.out.println(set.size());
		
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "Hello");
		map.put("hit", 12);
		
		System.out.println(map.get("title"));
		
		for (int i=0; i<list.size(); i++)
			System.out.printf("%d,", list.get(i));
		
	}

}
