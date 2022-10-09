package methods;

public class Main {

	public static void main(String[] args) {
		int gonderilen = 5;
		sayiBulma(gonderilen);

		mesajGonder("Sayı var");
	}

	public static void sayiBulma(int gelen) {
		int[] sayilar = { 1, 2, 5, 6, 8, 9 };
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == gelen) {
				varMi = true;
				break;
			}
		}
	}

	public static void mesajGonder(String gelen) {
		System.out.println(gelen);

	}
}