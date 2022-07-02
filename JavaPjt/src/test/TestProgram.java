package test;

import java.util.Scanner;

public class TestProgram {

public static void main(String[] args) {
		//가변적
	
		ExamList list = new ExamList();
		int menu;
		boolean keepLoop = true;
		
		int current = 0;

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