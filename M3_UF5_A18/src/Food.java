
public class Food extends GoodAbstract {
	private int calories;
	
	public Food(String description, double price, int quantity, int calories) {
		super(description, price, quantity);
		this.calories = calories;
	}
	
	int getCalories() {
		return this.calories;
	}
	
	void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String toString() {
		return "item: " + getDescription() + " quantity: " +
				getQuantity() + " price: " + calculateTax() + " calories: " + getCalories();
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return price * taxRate;
	}
}
