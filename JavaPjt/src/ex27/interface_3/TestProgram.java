package ex27.interface_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// 파일을 읽는다
		// 파일경로에 있는 파일의 클래스정보를 얻는다.
		// 클래스정보를 활용해 인스턴스를 만든다.
		
		FileInputStream fis = new FileInputStream("src/ex29/interface_3/setting.txt");
		Scanner scan = new Scanner(fis);
		String fileName = scan.nextLine();
		
		Class clazz = Class.forName(fileName);
		
		X x = (X) clazz.newInstance();
	}

}
