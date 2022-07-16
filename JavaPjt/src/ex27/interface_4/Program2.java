package ex27.interface_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 
		
		FileInputStream fis = new FileInputStream("src/ex27/interface_4/setting.txt");
		Scanner scan = new Scanner(fis);
		String filename = scan.nextLine();
		
		Class clazz = Class.forName(filename);
		Speaker speaker = (Speaker) clazz.newInstance();
		
		SamMobile mobile = new SamMobile();
		mobile.setSpeaker(speaker);
		mobile.play();
	}

}
