package productCartShopping;

import java.sql.SQLException;
import java.util.List;

public class ShoppingCartMain {

	public static void main(String[] args) throws SQLException{
		ShoppingCart cart=new ShoppingCartImp();
		
		//Add product
		cart.addproduct(new Product(1,"Mobile",8000));
		cart.addproduct(new Product(2,"PC",80000));
		cart.addproduct(new Product(3,"HeadPhone",700));
		cart.addproduct(new Product(4,"Laptop",50000));
		cart.addproduct(new Product(5,"Mobile",9000));
		
		//get product
		List<Product> products=cart.getProduct();
		System.out.println("Display Product");
		
		for(Product p:products)
		{
			System.out.println(p);
		}
		
		
		//delete product 
		
		if(cart.removeProduct(1))
		{
			System.out.println("Product deleted !");
		}
		else
		{
			System.out.println("Product not deleted !");
		}
		/*String result=cart.removeProduct(1)?"Product Remove Sucessfully ":"Product not remove ";
		System.out.println(result);*/
		
		//get product
				List<Product> product1=cart.getProduct();
				System.out.println("Display Product");
				
				for(Product p:product1)
				{
					System.out.println(p);
				}
				
		
		//Connection close
				
				System.out.println(cart.calculate());
		
		cart.closeConnection();

		
	}

}
