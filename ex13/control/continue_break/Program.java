 /*
 * continue & break
 */

package ex13.control.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 space로 구분하여 5개 이상 입력하세요");
		
		// 3 5 67 45 345 33 222 12
		
		// scan.hasNext()스트림 버퍼에 읽어올 data가 있는지 bloolean 값을 리턴한다.
		//즉, 값이 있으면 언제나 true
		while(scan.hasNext()) {
			n = scan.nextInt();
			
			if (n < 10)
				continue;
			if (n > 200)
				break;
			
			System.out.println(n);
			
		}
	}
}