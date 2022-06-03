/*
<task>
1. 객체를 중심으로 하는 문법을 써보자.
2. instance methods 사용 <==> static methods
3. static키워드 없음. 파라미터 없음. 객체에 일을 시키는 의미
*/
package ex21.encapsulation;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		ExamList.init(list);
		int menu;
		boolean keepLoop = true;


		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {

			case 1:
//				ExamList.inputList(list);
				// instance method 호출
				list.inputList();
				break;

			case 2:
				// instance method 호출
				list.printList();
				break;

			case 3:
				System.out.println("Good-bye~");
				keepLoop = false;
//				break 종료;
				break;

			default:
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;

			}
		}
	}


	static int inputMenu() {

		Scanner scan = new Scanner(System.in);

		// 메뉴 함수
		System.out.println("┌──────────────────┐");
		System.out.println("│      메뉴        │");
		System.out.println("└──────────────────┘");

		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");

		System.out.print("> ");
		int menu = scan.nextInt();
		
		return menu;
	}

}