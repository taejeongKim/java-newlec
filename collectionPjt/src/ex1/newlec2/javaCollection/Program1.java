package ex1.newlec2.javaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 1. ArrayList
 * 2. HashSet
 * */
public class Program1 {

	public static void main(String[] args) {
		
		// 자료형은 List계열 인터페이스로 받는다.
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		for (int i=0; i<list.size(); i++)
			System.out.printf("%d,", list.get(i));
		System.out.println();
		System.out.printf("size of list : %d\n", list.size());
		
		// iterator
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.printf("%d,", it.next());
		}
		System.out.println();
		
		// set은 값 자신이 식별자다.
		// 따라서, 중복된 값은 허용되지 않는다.
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		list.add(7);
		list.add(7);
		System.out.printf("size of set : %d\n", set.size());
		
		Iterator it2 = set.iterator();
		
		while (it2.hasNext()) {
			System.out.printf("%d,", it2.next());
		}
		
		for (int  v: set) {
			System.out.println(v);
		}
	}

}
