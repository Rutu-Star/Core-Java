package productCartShopping;

import java.sql.SQLException;
import java.util.List;

public interface ShoppingCart {
	
	void addproduct(Product product) throws SQLException;
	boolean removeProduct(int productId);
	List<Product> getProduct() throws SQLException;
	double calculate();
	void closeConnection() throws SQLException;

}
