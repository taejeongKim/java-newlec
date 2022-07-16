/*
<task>
1. 지금 까지 사용하던 static 메소드(함수)를 모두 인스턴스 메소드로 바꿔보자.
2. 인스턴스 메소드가 더 직관적인지 생각해 보자.
3. 객체 지향의 의미를 생각해 보자.
*/
package ex22.methods;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		list.init();
		int menu;
		boolean keepLoop = true;


		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {

			case 1:
				// static method
				ExamList.inputList(list);
				// instance method
//				list.inputList();
				break;

			case 2:
//				ExamList.printList(list);
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