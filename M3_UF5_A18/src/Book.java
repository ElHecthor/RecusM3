
public class Book extends GoodAbstract{
	private String author;
	
	public Book(String description, double price, int quantity, String author) {
		super(description, price, quantity);
		this.author = author;
	}
	
	String getAuthor() {
		return this.author;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "item: " + getDescription() + " quantity: " +
				getQuantity() + " price: " + calculateTax() + " author: " + getAuthor();
	}
	
	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return price * taxRate;
	}
}
