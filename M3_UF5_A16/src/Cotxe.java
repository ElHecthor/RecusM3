
public class Cotxe extends Vehicle {

	protected int numAsientos;
	
	public Cotxe(String model, int cilindrada, String marca, int numAsientos) {
		super(model, cilindrada, marca);
		
		this.numAsientos = numAsientos;
	}

}
