
public class Utilitari extends Cotxe {

	protected int tamany;
	
	public Utilitari (String model, int cilindrada, String marca, int numAsientos, int tamany) {
		super(model,cilindrada,marca,numAsientos);
		
		this.tamany = tamany;
	}
}
