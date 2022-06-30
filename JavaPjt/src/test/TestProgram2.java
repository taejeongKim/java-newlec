package test;

public class TestProgram2 {
	
	public static void main(String[] args) {

		int[] arr = new int[3];
		
		arr[0] = 3;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] temp = new int[8];
		
		for (int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		
		arr = temp;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
