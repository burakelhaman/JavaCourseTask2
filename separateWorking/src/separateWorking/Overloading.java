package separateWorking;

public class Overloading {

	// add int,int
	static int add(int a, int b) {
		System.out.println("1.Metot");
		return a + b;
	}

	// add int,int,int
	static int add(int a, int b, int c) {
		System.out.println("1.Metot");
		return a + b + c;
	}

	// add int,int,double
	static double add(int a, int b, double c) {
		System.out.println("1.Metot");
		return a + b + c;
	}

	public static void main(String[] args) {

		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 5));
		System.out.println(add(1, 2, 9.0));
	}

}
