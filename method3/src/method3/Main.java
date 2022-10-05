package method3;

public class Main {

	public static void main(String[] args) {
		int toplam = topla(2,3,4);
		System.out.println(toplam);

	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}