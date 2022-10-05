package classesWithAttributes;

public class Product {
	// Yazılım Geliştirme Prensipleri vardır

	// Single Responsibility Principle / Bir Class sadece bir işi yapar
	// Bu nedenle Product Class'ı hem Attribute tutup hem de Operasyonları
	// içermemeli

	// attribute | field
	int id;
	String name;
	String description;
	double price;
	int stockAmount;

}