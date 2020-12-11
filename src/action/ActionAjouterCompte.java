package action;

import java.util.Scanner;

import banque.AgenceBancaire;
import banque.Compte;

public class ActionAjouterCompte<E> implements Action<E>{
    private String message;
    private String code;

    public ActionAjouterCompte(String message) {
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
        System.out.println("Saisir le propriétaire");

        String prop = scan.nextLine();

        Compte c = new Compte(num,prop);
        ((AgenceBancaire) e).addCompte(c);




    }

	public void execute(ActionContext<E> ac) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
