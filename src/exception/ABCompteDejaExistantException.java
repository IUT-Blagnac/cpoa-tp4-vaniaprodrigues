package exception;

public class ABCompteDejaExistantException extends Exception{

	public ABCompteDejaExistantException() {
		this("Erreur sur un objet de la classe AgenceBancaire");
	}
	
	public ABCompteDejaExistantException(String message) {
		super(message);
	}
	
}
