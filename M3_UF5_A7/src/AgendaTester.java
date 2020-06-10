import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AgendaTester {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner teclado = new Scanner(System.in);
		File fichero = new File("agenda.txt");
		Scanner file = new Scanner(fichero);
		Contacte[] contactes = new Contacte[file.nextInt()];
		
		int contador = 0;
		while (file.hasNextLine()){
			String nomCognom = file.next() + " " + file.next();			
			file.next();
			int numTelefon = file.nextInt();
			
			contactes[contador] = new Contacte(nomCognom, numTelefon);
			contador++;
		}
		
		Agenda agenda = new Agenda(contactes);
		System.out.println("Afegeix nom i cognom: ");
		String resposta = teclado.nextLine();
		while(!resposta.equals("sortir")){
			String numero =	agenda.buscarContactes(resposta);
			
			
			if(numero.equals("-1")){
				System.out.println("No existeix contacte");
			} else {
				System.out.println(numero);
			}
			
			System.out.println("Afegeix nom i cognom: ");
			resposta = teclado.nextLine();
			
		} 
		agenda.mostrarAgenda();
	}
}




class Agenda {
	public Contacte[] contactes;
	
	public Agenda(Contacte[] contactes){
		this.contactes = contactes;
	}
	
	public String buscarContactes(String nomCognom){
		for (int i = 0; i < contactes.length; i++) {
			String nom = contactes[i].getName(); 
			if (nom.equals(nomCognom)) {
				return contactes[i].getTelefon() + "";
			}
		}
		
		return "-1";
	}
	
	public String toString(){
		String listaContactos = "";
		for (int i = 0; i < contactes.length; i++) {
			listaContactos += "\n" + contactes[i].getName() + " - " + contactes[i].getTelefon();
		}
		return listaContactos;
	}
	
	public void mostrarAgenda() {
		System.out.println(toString());
	}
}




class Contacte {
	private String nomCognom;
	private int telefon;

	// Getter del nom
	public String getName(){
		return nomCognom;
	}

	// getter del telefon
	public int getTelefon(){
		return telefon;
	}
	
	// setter del nom
	public void setName(String nomCognom){
		this.nomCognom = nomCognom;
	}

	// setter del telefon
	public void setTelefon(int telefon){
		this.telefon = telefon;
	}

	// constructor del nom i el telefon
	public Contacte(String nomCognom, int telefon){
		this.nomCognom = nomCognom;
		this.telefon = telefon;
	}
}