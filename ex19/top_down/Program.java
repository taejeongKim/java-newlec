package ex19.top_down;

public class Program {

	public static void main(String[] args) {

		// 
		
		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while(running){
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				lottos = createLottoAuto();
				break;
			case 2:
				lottos = createLottoAuto();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:
			}
			
		}
	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] createLottoAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		
		return 0;
	}

}
