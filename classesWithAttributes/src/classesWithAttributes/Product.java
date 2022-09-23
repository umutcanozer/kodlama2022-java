package classesWithAttributes;

public class Product {
	// Constructor
	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		System.out.println("Constructor successful"); // newlendiğinde bloğu çalıştırıyoruz
		this.id = id;
		this.color = color;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
		this.name = name;
	}

	/*
	 * public Product() { overloading }
	 */

	// attributes or field
	private int id; // sadece tanımlandığı blokta geçerli
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;

	public int getId() {
		return id; // tek get verilirse id sadece okunabilir , yazılamaz.
	}

	public void setId(int id) {
		this.id = id; // this= bu class
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

}