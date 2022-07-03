package test;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
	
		ExamConsole list = new ExamConsole(2);
		int menu;
		boolean running = true;
		
		while (running) {
			
			menu = inputMenu();
		
			switch (menu) {
			case 1:
				list.inputExam();
				break;
			case 2:
				list.printExam();
				break;
			case 3:
				System.out.println("good bye~");
				running = false;
				break;
			default:
				System.out.println("입력오류, 1~3번까지만 입력할 수 있습니다.");
				break;
			}
			
		}
		

	}

	private static int inputMenu() {
		
		System.out.println("--- 메뉴 --");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1) 성적입력");
		System.out.println("2) 성적출력");
		System.out.println("3) 종료");
		
		System.out.print(">");
		int menu = scan.nextInt();
		
		return menu;
	}

}
