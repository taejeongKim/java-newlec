package ex27.abstraction.ibm;

import exam_management.ExamConsole;

public class Program {

	public static void main(String[] args) {

		ExamConsole list = new IbmExamConsole();
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = list.inputMenu();

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
}
