package test2;

import java.util.Scanner;

/*
 * 성적관리프로그램
 * 과목 3
 * 반 (가변적)
 * */
public class Program {

	public static void main(String[] args) {
		
		// 메뉴 (성적입력/성적출력/종료)
		
		int menu;
		boolean running = true;
		final int INPUT_MENU = 1;
		final int PRINT_MENU = 2;
		final int EXIT_MENU = 3;
		ExamConsole console = new ExamConsole();
		
		while(running) {
			
			menu = inputMenu();
			
			switch (menu) {
			case INPUT_MENU:
				console.input();
				break;
			case PRINT_MENU:
				console.print();
				break;
			case EXIT_MENU:
				System.out.println("Good Bye ~");
				running = false;
				break;
			default:
				System.out.println("input menu again");
				break;
			}
		}

	}

	private static int inputMenu() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- MENU ---");
		System.out.println("1) 성적입력");
		System.out.println("2) 성적출력");
		System.out.println("3) 종료");
		System.out.print("> ");
		
		int menu = scan.nextInt();
		
		return menu;
	}
	
}
