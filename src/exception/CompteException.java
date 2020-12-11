package exception;


public class CompteException extends Exception {

	/**
	 * Constructeur par d�faut.<BR>
	 */
	public CompteException() {
		super("Erreur sur un objet de la classe Compte");
	}

	/**
	 * Constructeur param�tr�.<BR>
	 * 
	 * @param message
	 *            information qui sera affich�e si l'exception est affich�e �
	 *            l'�cran
	 */
	public CompteException(String message) {
		super(message);
	}
}
