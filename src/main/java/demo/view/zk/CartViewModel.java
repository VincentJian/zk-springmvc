package demo.view.zk;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.NotifyChange;

import demo.data.bean.CartItem;
import demo.data.bean.Product;

public class CartViewModel {

	private List<CartItem> cartList = new ArrayList<CartItem>();
	
	public List<CartItem> getCartList() {
		return cartList;
	}
	
	public int getTotal() {
		int total = 0;
		for (CartItem item : cartList) {
			total += item.getSubtotal();
		}
		return total;
	}
	
	@GlobalCommand @NotifyChange({"cartList", "total"})
	public void addCart(@BindingParam("product") Product prod) {
		int quantity = prod.getQuantity();
		prod.setQuantity(0);
		if (quantity <= 0)
			return;
		boolean isAddNew = true;
		if (!cartList.isEmpty()) {
			for (CartItem item : cartList) {
				if (item.getProduct().getId() == prod.getId()) {
					isAddNew = false;
					item.add(quantity);
					break;
				}
			}
		}
		if (isAddNew) {
			CartItem item = new CartItem(prod);
			item.add(quantity);
			cartList.add(item);
		}
	}
}
