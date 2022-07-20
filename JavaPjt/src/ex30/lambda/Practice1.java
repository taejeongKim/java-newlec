package ex30.lambda;

public class Practice1 {

	public static void main(String[] args) {

//		Object obj = (a, b) -> a > b ? a : b;
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
//		int value = obj.max(3,4);
		
/*
 1. 자바에는 함수가 단독으로 존재할 수 없어서
  	객체 안에 넣었다.
 2. 
 */
		
	}

}
