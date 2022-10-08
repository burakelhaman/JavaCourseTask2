package separateWorking;

public class Siniflar {

	public static void main(String[] args) {
		// Object Oriented Programming
		// SinifAdi objeAdi = new SinifAdi();
		// Constructor (Yapıcı/Kurucu)

		HesapMakinesi m1 = new HesapMakinesi(10, 5, "siyah");
		System.out.println(m1.toplama());
		m1.sayi1 = 8;
		System.out.println(m1.cikarma());

		HesapMakinesi m2 = new HesapMakinesi(20, 3, "mavi");
		System.out.println(m2.toplama());

	}
}