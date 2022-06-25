package temp;

public class TempProgram {

	public static void main(String[] args) {
		// 가변형 배열 = 콜렉션
		
		GList<String> list = new GList<>();
		list.add("I");
		list.add("You");
		int size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);

		list.add("pretty");
		String num = list.get(0); 
		System.out.printf("num : %s\n", num);
		
	}

}
