
public abstract class Vehicle {

	protected String model;
	protected int cilidrada;
	protected String marca;
	
	public Vehicle (String model, int cilindrada, String marca) {
		
		this.model = model;
		this.cilidrada = cilindrada;
		this.marca = marca;
	}
	
	public int getCilindrada() {
		
		return cilidrada;
	}
	
}
