package demo.data.bean;

public class OrderItem {

	private int id;
	private int orderId;
	private int prodId;
	private String name;
	private int price;
	private int quantity;

	public OrderItem() {}

	public OrderItem(int id, int orderId, int prodId, String name, int price,
			int quantity) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.prodId = prodId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
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

	public int getSubTotal() {
		return getPrice() * getQuantity();
	}

	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", prodId="
				+ prodId + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
}
