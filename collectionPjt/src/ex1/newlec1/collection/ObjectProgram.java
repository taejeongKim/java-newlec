package ex1.newlec1.collection;

public class ObjectProgram {

	public static void main(String[] args) {

		ObjectList list = new ObjectList();
		list.add(3);
		list.add(5);
		list.clear();
		int size = list.size();
		System.out.printf("size: %d\n", size);
		list.add(7);
		// object 리스트에서 꺼낼 때 자료형을 알 수 없다.
		// 일일이 자료형을 바꾸어 줘야 한다.
		int num = (int) list.get(0);
		System.out.printf("num: %d\n", num);
		num = (int) list.get(1);
		
	}

}
