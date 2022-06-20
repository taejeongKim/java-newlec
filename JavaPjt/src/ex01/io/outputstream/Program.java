package ex01.io.outputstream;

public class Program {

	public static void main(String[] args) {
		
		// '3'은 문자3에 해당하는 문자표를 반환한다.
		System.out.write('3'+1); 
		System.out.write('3'+2);
		System.out.write('3'+3);
		System.out.write('3'+4);
		
		// outputstream 버퍼에 담긴 것을 내보낸다.
		System.out.flush();  
		
	}

}
