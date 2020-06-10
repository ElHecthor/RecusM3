
public class Passeig extends Moto {

	protected String consum;
	
	public Passeig (String model, int cilindrada, String marca, int ruedas, String consum) {
		
		super(model,cilindrada,marca,ruedas);
		
		this.consum = consum;
	}
}
