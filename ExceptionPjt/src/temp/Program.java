package temp;

public class Program {

	public static void main(String[] args) {
		
		int result = 0;
		
		try {
			result = Calculator2.add(3, 5);
			System.out.printf("add : %d\n",result);
			result = Calculator2.sub(3, 5);
			System.out.printf("sub : %d\n",result);
			
			result = Calculator2.multi(3, 5);
			System.out.printf("mul : %d\n",result);
			
			result = Calculator2.div(3, 3);
			System.out.printf("div : %d\n",result);
		} catch (MinusException | OverTenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("일반적 예외");
		} finally {
			System.out.println("test");
		}
		

	}

}
