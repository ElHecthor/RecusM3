
public class Drink extends GoodAbstract {
	private String type;
	
	public Drink(String description, double price, int quantity, String type) {
		super(description, price, quantity);
		this.type = type;
	}
	
	String getType() {
		return this.type;
	}
	
	void setAuthor(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "item: " + getDescription() + " quantity: " +
				getQuantity() + " price: " + calculateTax() + " type: " + getType();
	}
	
	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return price * taxRate;
	}
}
