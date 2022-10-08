package seperateWorking2;

public class Student {
	public String name;
	public int id, point;
	// Nesne tanımlanmasına gerek kalmadan static ile değişken tanımlanabilir
	// Sinif.degisken ile kullanılır
	private static int counter = 0;

	Student(String name, int id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
		Student.counter++;
	}

	public void exit() {
		Student.counter--;
	}

	// static ile nesne tanımlanmasına gerek kalmadan metot da tanımlanabilir
	// Sinif.metot ile çağırılır
	public static int howStudent() {
		return Student.counter;
	}

	public static double calcOverall(int[] arr) {
		double overall = 0;
		for (int i = 0; i < arr.length; i++) {
			overall += arr[i];
		}
		return overall / arr.length;
	}

}
