package demo.data.bean;

public class CartItem {

	private Product product;
	private int quantity;
	
	public CartItem(Product product) {
		super();
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void add(int quantity) {
		this.quantity += quantity;
	}
	
	public int getSubtotal(){
		return product.getPrice() * quantity;
	}
}
