package demo.data.bean;

public class Product {

	private int id;
	private String name;
	private int price;
	private int quantity;
	private String description;
	
	public Product() {}
	public Product(int id, String name, int price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
}
