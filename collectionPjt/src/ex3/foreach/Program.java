package ex3.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * [기본 형식]
 * for (type var : iterate) {
    body-of-loop
}
 * */
public class Program {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for(int v : arr)
			System.out.println(v);
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(Object v : list)
			System.out.println(v);
		
		Set set = new HashSet();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(Object v : set)
			System.out.println(v);
		
	}

}
