package ex17.practice;

public class P02_IfinFor {

	public static void main(String[] args) {
		// for문 안의 if문
		// 반복 중에 예외 처리
		
		
		// A,B,C,D,E, 출력
		
		for (int i = 0; i < 5; i++)
			System.out.printf("%c, ", 'A'+i);
		
		System.out.println();
		System.out.println("---------------");
		
		// A,B,C,D,E, 에서 마지막 콤마(,)삭제
		
		for (int i = 0; i < 5; i++)
			// if .. else문으 한 문장이므로 중괄호{}를 안 써도 된다.
			if (i==4) 	// if, else if 등은 특별한 경우다.
				System.out.printf("%c", 'A'+i);
			else  		// if문에서 else 는 특별하지 않은 대부분의 경우를 말하고...
				System.out.printf("%c, ", 'A'+i);
		
		System.out.println();
		System.out.println("---------------");
		
		// A,B,C,D,E, 에서 마지막 콤마(,)삭제
		// 짝수번째 숫자 빈칸 처리
		
		for (int i = 0; i < 5; i++)
			// if문 중 상위에 있는 것이 보다 특별한 경우, 드문 경우이
			if (i==4) 	
				System.out.printf("%c", 'A'+i);
			else if (i%2==1)
				System.out.print("  ");
			else  		
				System.out.printf("%c, ", 'A'+i);
	}

}