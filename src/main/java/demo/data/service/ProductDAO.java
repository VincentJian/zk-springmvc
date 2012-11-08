package demo.data.service;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import demo.data.bean.Product;

@Service
public class ProductDAO {

	private static List<Product> productList = Collections.synchronizedList(new LinkedList<Product>());
	private static int id = 1;
	private static Random rand = new Random();
	
	static {
		rand.setSeed(new Date().getTime());
		productList.add(new Product(id++, "Product 1", rand.nextInt(9999) + 100, "description 1"));
		productList.add(new Product(id++, "Product 2", rand.nextInt(9999) + 100, "description 2"));
		productList.add(new Product(id++, "Product 3", rand.nextInt(9999) + 100, "description 3"));
		productList.add(new Product(id++, "Product 4", rand.nextInt(9999) + 100, "description 4"));
		productList.add(new Product(id++, "Product 5", rand.nextInt(9999) + 100, "description 5"));
	}
	
	public ProductDAO() {}
	
	public List<Product> findAll() {
		return productList;
	}

}
