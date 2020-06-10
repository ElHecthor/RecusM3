
public class Esportiu extends Cotxe{

	protected int velocitatMax;
	
	public Esportiu (String model, int cilindrada, String marca, int numAsientos, int velocitatMax) {
		
		super(model,cilindrada,marca,numAsientos);
		
		this.velocitatMax = velocitatMax;
	}
}
