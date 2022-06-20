package test;

import java.util.Scanner;

import ex24.ui_code_seperation.ExamConsole;


public class TestProgram {

	public static void main(String[] args) {

/*국/영/수 성적관리 프로그램
 * 성적입력
 * 성적출력
 * 종료
 * */		
		ExamConsole list = new ExamConsole();
		boolean running = true;
		
		while(running) {

			
			int menu = selectMenu();
			
			switch(menu) {
			case 1:
				list.inputList();
				break;
			case 2:
				list.printList();
				break;
			case 3:
				System.out.println("Good bye ~");
				running = false;
				break;
			default:
				System.out.println("Input again ~");
				break;
			}
			
		}
		
	}

	private static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--- 메뉴 ---");
		System.out.println("1) 성적입력");
		System.out.println("2) 성적출력");
		System.out.println("3) 종료");
		System.out.print("> ");
		
		int menu = scan.nextInt();
		return menu;
	}

}