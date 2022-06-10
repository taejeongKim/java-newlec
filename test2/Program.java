/*
<task>


*/
package test2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		// 초기화 함수
		ExamList.init(list);
		int menu;
		boolean keepLoop = true;


		while (keepLoop) {

			// 메뉴함수는 menu를 리턴해줘야 한다.
			menu = inputMenu();

			switch (menu) {

			case 1:
				// 매개변수로 구조체(객체)의 리스트만 넘긴다. 리스트에는 아직 객체가 없다.
				// inputList에서 객체를 만들어 리스트에 채워야 한다.
				ExamList.inputList(list);
				break;

			case 2:
				// inputList에서 객체 리스트에 객체를 담았으니 객체와 연결된 리스트가 전달됨.
				ExamList.printList(list);
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