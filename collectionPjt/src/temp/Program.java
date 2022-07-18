package temp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hi");
		list.add("hi");
		list.add("hi");

		System.out.println(list.get(2));
		
		Iterator it =  list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
