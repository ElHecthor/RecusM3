
public class StoreTester {
	public static void main(String[] args) {
		Toy toy = new Toy("descripcion Toy", 1.6, 1, 3);
		Drink drink = new Drink("descripcion Drink", 1.2, 4, "Agua");
		Book book = new Book("descripcion Book", 1.2, 4, "Hector Navarrete");
		Food food = new Food("descripcion Food", 3, 10, 3000);
		
		System.out.println(toy);
		System.out.println(drink);
		System.out.println(book);
		System.out.println(food);
	}
}
