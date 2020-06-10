public abstract class GoodAbstract implements Taxable{
	private String description;
	protected double price;
	private int quantity;
	
	public GoodAbstract(String description, double price,
			int quantity){
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String toString() {
		return "item: " + getDescription() + " quantity: " +
				getQuantity() + " price: " + getPrice();
	}
}