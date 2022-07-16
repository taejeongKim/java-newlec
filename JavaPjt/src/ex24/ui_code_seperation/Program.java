/*
 * 본 강좌의 코드 완성
 * 
<task>
1. ui와 관련된 코드는 분리하여 ExamConsole 클래스를 만든다.
2. 이유: ui 관련된 부분은 플랫폼에 따라 변화가 많기 때문...
*/
package ex24.ui_code_seperation;

public class Program {

	public static void main(String[] args) {

		ExamConsole list = new ExamConsole();
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