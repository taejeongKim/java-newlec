package ex2.nam.iterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {

		// Map & Iterator
		// keySet()
		// entrySet()
		// values()
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "Hello");
		map.put("hit", 12);
		
//		Set eSet = map.entrySet();
//		Iterator it = eSet.iterator();
		Iterator it = map.entrySet().iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}

}
