package ex22.methods;

class Inner{
	
	int age;
	
	void printAge() {
		System.out.printf("I am %d years old.\n", this.age);
	}
	
	static void printAge(Inner in) {
		System.out.printf("I am %d years old.\n", in.age);
	}
	
}

public class TestProgram {

	public static void main(String[] args) {
	
		Inner in = new Inner();
		in.age = 30;
		
		in.printAge();
		Inner.printAge(in);

	}

}
