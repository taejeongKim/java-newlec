package temp;

import java.util.ArrayList;
import java.util.Collection;

public class TempProgram {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for (int v : arr)
			System.out.println(v);
		
		Collection list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for (Object v : list)
			System.out.println(v);
		
	}

}
