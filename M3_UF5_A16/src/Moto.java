
public class Moto extends Vehicle {

	protected int ruedas;
	
	public Moto (String model, int cilindrada, String marca, int ruedas) {
		
		super(model,cilindrada,marca);
		
		this.ruedas = ruedas;
	}
}
