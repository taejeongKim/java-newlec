/*
<task>
1. Program class에 있는 printList, inputList함수를 ExamList로 옮겨서 캡슐화 시킨다.
2. 변수의 영향을 받는 함수들이 여기 저기 흩어져 있으면 유지관리가 어렵다. 
3. ExamList 변수에 영향을 받는 함수들을 모아 같은 클래스에 묶어 놓는 것.
4. 이 것을 캡슐화 encapsulation 이라 한다.

*/
package ex22.methods;

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
				// 
				ExamList.inputList(list);
				break;

			case 2:
				// 
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