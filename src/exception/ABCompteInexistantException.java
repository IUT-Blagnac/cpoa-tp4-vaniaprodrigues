package exception;


public class ABCompteInexistantException  extends Exception  {
	public ABCompteInexistantException() {
		this("Erreur sur un objet de la classe AgenceBancaire");
	}
	
	public ABCompteInexistantException(String message) {
		super(message);
	}
}
