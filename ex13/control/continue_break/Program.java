 /*
 * continue & break
 */

package ex13.control.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� space�� �����Ͽ� 5�� �̻� �Է��ϼ���");
		
		// 3 5 67 45 345 33 222 12
		
		// scan.hasNext()��Ʈ�� ���ۿ� �о�� data�� �ִ��� bloolean ���� �����Ѵ�.
		//��, ���� ������ ������ true
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