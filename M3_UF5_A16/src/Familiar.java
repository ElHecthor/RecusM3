
public class Familiar extends Cotxe {

	protected int seguridad;
	
	public Familiar (String model, int cilindrada, String marca, int numAsientos, int seguridad) {
		
		super(model,cilindrada,marca,numAsientos);
		
		this.seguridad = seguridad;
	}
}
