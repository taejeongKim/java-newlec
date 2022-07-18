package ex1.newlec1.collection;

public class IntProgram {

	public static void main(String[] args) {

		IntList list = new IntList();
		list.add(3);
		list.add(5);
		list.clear();
		int size = list.size();
		System.out.printf("size: %d\n", size);
		list.add(7);
		int num = list.get(0);
		System.out.printf("num: %d\n", num);
		num = list.get(1);
		
	
	}

}
