package ex30.inner_class;

public class Program3 {
	//
	class InstanceInner{
		int iv = 100;
		static int cv = 100;
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 300;
			static int cv = 300;
			final static int CONST = 200;
		}
		
		int i = LocalInner.CONST; // ok
	}

	public static void main(String[] args) {

//		InstanceInner in = new InstanceInner();
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); //  no
	}

}
