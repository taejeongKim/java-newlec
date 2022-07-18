package ex28.inner_class1;

class AA{ //외부 클래스
	int i = 100;
	BB b = new BB();

	class BB { // 내부 클래스, BB는 AA에서만 사용됨.
		void method() {
			// 객체 생성이 불필요
//			AA a = new AA();
//			System.out.println(a.i);
			System.out.println(i);
		}
	}
}

//class cc{
//	BB b = new BB();
//}

public class Program2 {

	public static void main(String[] args) {
//		BB b = new BB();
//		b.method();
		
	}

}
