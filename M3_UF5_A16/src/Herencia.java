
public class Herencia {

	public static void main(String[] args) {
				
		Vehicle[] arrayVehicles = new Vehicle[5];
		
		arrayVehicles[0] = new Utilitari("focus", 300, "ford", 4, 4);
		arrayVehicles[1] = new Familiar("golf", 350, "volskvagen", 7, 9);
		arrayVehicles[2] = new Esportiu("Aventador", 800, "lamborgini", 2, 350);
		arrayVehicles[3] = new Passeig("sdfgsdgfg", 60, "vdfg", 2, "Bjghj");
		arrayVehicles[4] = new Carreres("ghjja", 21233, "kghjj", 23, 123);
		
		for (int i = 0; i < arrayVehicles.length; i++) {
			System.out.println(arrayVehicles[i].getCilindrada());
		}
	}

}
