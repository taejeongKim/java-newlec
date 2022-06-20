package ex27.interface_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/ex27/interface_/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		// Class : 클래스정보를 얻는 클래스
		Class clazz = Class.forName(className);
		
		//class 정보를 얻는 방법
		// class명.class
		// 객체명.getClass()
		
		/* 객체 만드는 2가지 방법 
		 * 1. 함수사용
		 * 		A.class.newInstance();
		 * 2. new 사용
		 *      new A();
		 * */
		
		A a = new A();
		// 클래스 정보를 가지고 객체를 만들고 있다.
		X x = (X) clazz.newInstance();
		a.setX(x);
		
		a.print();

	}

}
