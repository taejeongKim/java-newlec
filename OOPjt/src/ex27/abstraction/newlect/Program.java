package ex27.abstraction.newlect;

import java.util.Scanner;

/*
 [task]
 1. Exam을 상속하여 lewlecExam을 만들어보자.
 2. 새로운 과목 : computer
 3. 오버라이딩 : total(), avg()
 4. 메소드 동적 바인딩
 */
public class Program {

	public static void main(String[] args) {
		
		NewlecExamConsole console = new NewlecExamConsole();
		int menu;
		boolean running = true;
		
		while(running) {
			
			menu = selectMenu();
			
			switch (menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
				break;
			case 3:
				System.out.println("Good bye ~");
				running = false;
				break;
			default:
				System.out.println("Please input again!");
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
		System.out.println("> ");
		int menu = scan.nextInt();
				
		return menu;
	}

}
