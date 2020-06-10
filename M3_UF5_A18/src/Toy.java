
public class Toy extends GoodAbstract {
	private int minimumAge;
	
	public Toy(String description, double price, int quantity, int minimumAge) {
		super(description, price, quantity);
		this.minimumAge = minimumAge;
	}
	
	int getMinimumAge() {
		return this.minimumAge;
	}
	
	void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}
	
	public String toString() {
		return "item: " + getDescription() + " quantity: " +
				getQuantity() + " price: " + calculateTax() + " Minimum Age: " + getMinimumAge();
	}
	
	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return price * taxRate;
	}
}
