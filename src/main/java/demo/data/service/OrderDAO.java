package demo.data.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.data.bean.Order;

@Service
public class OrderDAO {

	private List<Order> orderList = Collections.synchronizedList(new ArrayList<Order>());
	private int id = 1;
	
	public boolean saveOrder(Order order) {
		return orderList.add(order);
	}
	
	public int findMaxId() {
		return id++;
	}

	public Order findById(int id) {
		for (Order o : orderList) {
			if (o.getId() == id)
				return o;
		}
		return null;
	}

	public List<Order> findAll() {
		return orderList;
	}
}
