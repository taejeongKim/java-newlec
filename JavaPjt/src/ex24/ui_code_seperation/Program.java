/*
<task>
1. ui와 관련된 코드는 분리하여 ExamConsole 클래스를 만든다.
2. 이유: ui 관련된 부분은 플랫폼에 따라 변화가 많기 때문...
*/
package ex24.ui_code_seperation;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamConsole list = new ExamConsole();
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {

			case 1:
				
				list.inputList();
				break;

			case 2:
				list.printList();
				break;

			case 3:
				System.out.println("Good-bye~");
				keepLoop = false;
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