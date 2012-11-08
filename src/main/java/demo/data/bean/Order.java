package demo.data.bean;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int id;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	public OrderItem getItem(int index){
		return items.get(index);
	}
	public void addItem(OrderItem item){
		items.add(item);
	}
	
	public int getTotalPrice() {
		int totalPrice = 0;
		for (OrderItem item : items)
			totalPrice += item.getSubTotal();
		return totalPrice;
	}
}
