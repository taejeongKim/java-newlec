package ex27.interface_3;
/* [task]
 * 1. B뿐아니라 새로운 C, D 등의 부품에 소스코드 수정없이 대응하도록 개발한다.
 * [hint]
 * 1. 외부 설정파일을 활용한다. 
 * */
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		/* 파일의 문자를 읽어오기 */
		// 파일명 입력 시 절대경로 or 상대경로 사용
		FileInputStream fis = new FileInputStream("src/ex29/interface_3/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		
		
		// class Class : 클래스정보 data 구조체
		// 파일경로의 파일을 찾아 클래스 정보를 가져온다.
		Class clazz = Class.forName(className);

		/* class 정보를 얻는 방법 */
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
