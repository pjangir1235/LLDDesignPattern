package Observer;

public class Product {
	int qty;
	String name;
	public Product(String name, int qty) {
		super();
		this.qty = qty;
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
