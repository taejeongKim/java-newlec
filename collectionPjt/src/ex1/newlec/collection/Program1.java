package ex1.newlec.collection;
/*
 * 1. int collection (콜렉션)을 직접 만들어 보자.
 * 2. 위 콜렉션을 Object형으로 바꾸어 본다.
 * 3. 불편한 점을 찾아본다.
 * */
public class Program1 {

	public static void main(String[] args) {
		
//		IntList list = new IntList();
//		ObjectList list = new ObjectList();
		// 나는 정수형을 원한다. 제네릭입니다.
		GList<Integer> list = new GList<>();
		list.add(3);
		list.add(4);
		int size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.add(7);
		int num = list.get(0); // 형변환이 필요없다
		System.out.printf("num : %d\n", num);
		
		// 아래는 예외발생
//		num = (int) list.get(1);
//		System.out.printf("num : %d\n", num);
	}

}
