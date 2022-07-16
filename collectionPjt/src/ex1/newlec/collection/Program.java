package ex1.newlec.collection;

public class Program {

	public static void main(String[] args) {

		IntList2 list = new IntList2();
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
