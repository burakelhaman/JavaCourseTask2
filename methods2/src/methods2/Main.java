package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün Hava Çok Güzel";
		String[] kelimeler = kelimelereAyir(mesaj);
		for (String string : kelimeler) {
			System.out.println(string);
		}

		System.out.println(sehirVer());
		int sayi = topla(5, 7);
		System.out.println(sayi);
	}

	public static String[] kelimelereAyir(String kelime) {
		String[] gonder = kelime.split(" ");
		return gonder;
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
