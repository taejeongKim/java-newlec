package ex2.nam.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); 
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// 위 while 문이 끝나고 나면 iterator는 종료.
		// 다시 사용하려면 객체를 다시 생성해야 한다.
		// iterator는 1회용이다.
		
		it = list.iterator(); 
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// iterator는 collection 안의 모든 data구조에 공히 적용된다.
		// 따라서, 중간에 collection 종류를 변경해도 코드를 수정할 필요가 없다.
		
		// ex) 아래 코드는 set에는 오류가 된다.
		// set에는 get()없으므로
		
		for (int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "Hello");
		map.put("hit", 12);
		
		it = map.entrySet().iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}

}
