/*
<task>
1. 접근 지정자 private
2. 생성자, 생성자 오버로드
3. getter & setter
4. total, avg 등 구조체에서 할 수 있는 연산은 구조체에게 ..
*/
package ex23.encapsulation_final;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {

			case 1:
				
				// ExamList.printList(list);
				
				// 인스턴스 메소드 호출
				list.inputList();
				break;

			case 2:
				// 
				//ExamList.printList(list);
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