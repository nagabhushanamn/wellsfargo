package com.pm.dao;

import java.util.ArrayList;
import java.util.List;

import com.pm.model.Product;

public class JdbcProductDAOImpl implements ProductDAO {

	public List<Product> findAll() {

		// List<Product> products = new ArrayList<Product>();
		// try {
		// Connection connection = MySQLConnectionFactory.getConnection();
		// String sql = "select * from pm.PRODUCTS";
		// PreparedStatement ps = connection.prepareStatement(sql);
		// ResultSet rs = ps.executeQuery();
		// while (rs.next()) {
		// Product product = new Product();
		// product.setId(rs.getInt(1));
		// product.setName(rs.getString(2));
		// product.setPrice(rs.getDouble(3));
		// products.add(product);
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }

		// return products;

		Product product1 = new Product(23424, "laptop", 198000);
		Product product2 = new Product(57474, "mobile", 25000);
		Product product3 = new Product(13423, "laptop", 98000);
		Product product4 = new Product(34635, "apple", 1000);

		// ----------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product4);

		return products;
	}

}
