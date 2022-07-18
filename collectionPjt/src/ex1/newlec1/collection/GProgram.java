package ex1.newlec1.collection;

public class GProgram {

	public static void main(String[] args) {

		//자료형 옆에 원하는 형식을 기입
		GList<Integer> list = new GList<>();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.printf("size: %d\n", size);
		
		list.clear();
		size = list.size();
		System.out.printf("size: %d\n", size);
		
		// 아래에서 형 변환이 필요 없다.
		list.add(7);
		int num = list.get(0); 
		System.out.printf("num: %d\n", num);
//		num = list.get(1);
		
	}

}
