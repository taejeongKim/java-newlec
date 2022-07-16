package ex27.abstraction.abc;

public class Program {

	public static void main(String[] args) {

		AbcExamConsole console = new AbcExamConsole();
		
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = console.inputMenu();

			switch (menu) {

			case 1:

				console.inputList();
				break;

			case 2:
				console.printList();
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
