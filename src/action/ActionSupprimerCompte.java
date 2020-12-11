package action;
import java.util.Scanner;

import banque.AgenceBancaire;
import banque.Compte;

public class ActionSupprimerCompte<E> implements Action<E> {
    private String message;
    private String code;

    public ActionSupprimerCompte(String message) {
        this.message = message;
        this.code = "0";
    }

    public String actionMessage() {
        return message;
    }

    public String actionCode() {
        return code;
    }

    public void execute(E e) throws Exception {
        System.out.println("Saisir le numéro du compte:");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        ((AgenceBancaire) e).removeCompte(num);




    }

	public void execute(ActionContext<E> ac) throws Exception {
		// TODO Auto-generated method stub
		
	}
}