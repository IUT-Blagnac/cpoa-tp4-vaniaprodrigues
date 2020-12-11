package exception;

public class ABCompteNullException extends Exception {
	
	public ABCompteNullException() {
		this("Erreur sur un objet de la classe AgenceBancaire");
	}
	
	public ABCompteNullException(String message) {
		super(message);
	}
}
