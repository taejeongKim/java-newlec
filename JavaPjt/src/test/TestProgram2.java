package test;

public class TestProgram2 {
	
	public static void main(String[] args) {

		for (int j = 0; j < 3; j++) {
			for (int i=0; i<3; i++)
				System.out.printf("%d ", (i+1)+j*3);
			System.out.println();
		}
		
		
	}

}
