package productCartShopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCartImp implements ShoppingCart{

	static String url="jdbc:mysql://localhost:3306/shopingcarddb";
	static String username="Rutu";
	static String password="Rutu@123";
	
	Connection con;
	public ShoppingCartImp() throws SQLException {
		// TODO Auto-generated constructor stub
		con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established Successfully !");
	}

	@Override
	public void addproduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String query="insert into product(id,name,price) values(?,?,?)";
		
		PreparedStatement per=null;
		try {
			per=con.prepareStatement(query);
			per.setInt(1,product.getId());
			per.setString(2, product.getName() );
			per.setDouble(3, product.getPrice());
			
			per.executeUpdate();
			System.out.println("Product Add Successfully !!");
			
		}
		catch(Exception e)
		{
			
		}
		
		per.close();
		
		
	}

	@Override
	public boolean removeProduct(int productId) {
		// TODO Auto-generated method stub
		String query="delete from product where id=productId";
		PreparedStatement per=null;
		try {
			per=con.prepareStatement(query);
			per.executeUpdate();
			
			return true;
		}
		catch(Exception e)
		{
			return false ;
		}
	
	}

	@Override
	public List<Product> getProduct() throws SQLException {
		// TODO Auto-generated method stub
		String query="select * from product";
		Statement st=null;
		ResultSet res=null;
		
		List<Product> product=new ArrayList<Product>();
		
	
			try {
				st=con.createStatement();
				res=st.executeQuery(query);
				
				while(res.next())
				{
					int id=res.getInt("id");
					String name =res.getString("name");
					double price=res.getDouble("price");
					product.add(new Product(id,name,price));
				}
			}
			catch(Exception e)
			{
				
			}
	
		st.close();
		return product;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		String query="select count(*) from product ";
		
		Statement  st=null;
		ResultSet res=null;
		double count=0;
		
		try
		{
			st=con.createStatement();
			res=st.executeQuery(query);
			count=res.getRow();
		}
		catch(Exception e)
		{
			
		}
		return count;
	}

	@Override
	public void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
