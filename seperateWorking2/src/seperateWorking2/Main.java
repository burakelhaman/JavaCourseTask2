package seperateWorking2;

public class Main {

	public static void main(String[] args) {

		System.out.println("Online Öğrenci : " + Student.howStudent());
		Student s1 = new Student("Ahmet", 220, 100);
		Student s2 = new Student("Ali", 330, 50);
		Student s3 = new Student("Mehmet", 200, 70);
		System.out.println("Online Öğrenci : " + Student.howStudent());
		s1.exit();
		System.out.println("Online Öğrenci : " + Student.howStudent());

		int[] notlar = { s1.point, s2.point, s3.point };

		System.out.println(Student.calcOverall(notlar));
	}
}