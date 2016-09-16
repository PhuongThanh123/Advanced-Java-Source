package exercise83AddNewProduct;

public class Product {
	private String name;
	private double price;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Product(String name, double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return this.name+this.price+this.amount+"\n";
	}
	
}
