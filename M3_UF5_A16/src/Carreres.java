
public class Carreres extends Moto {

	protected int acceleracio;
	
	public Carreres (String model, int cilindrada, String marca, int ruedas, int acceleracio) {
		
		super(model,cilindrada,marca,ruedas);
		
		this.acceleracio = acceleracio;
	}
}
