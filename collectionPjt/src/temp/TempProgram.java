package temp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TempProgram {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		
		System.out.println(set.size());
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
