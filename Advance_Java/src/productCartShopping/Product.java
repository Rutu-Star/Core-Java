package productCartShopping;

public class Product {
	
	private int id;
	private String Name;
	private double price;

	public Product(int id, String Name, double price) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.Name=Name;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", price=" + price + "]";
	}

}
