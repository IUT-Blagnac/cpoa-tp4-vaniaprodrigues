package action;

import java.util.Scanner;

import banque.AgenceBancaire;
import banque.Compte;

public class ActionDeposerArgent<E> implements Action<E> {

    String message;
    String code;


    public ActionDeposerArgent(String message) {
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
        System.out.println("Saisir numéro du compte:");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        System.out.println("Saisir le montant à déposer");
        double depot = scan.nextDouble();

        ((AgenceBancaire)e).getCompte(num).deposer(depot);
    }

	public void execute(ActionContext<E> ac) throws Exception {
		// TODO Auto-generated method stub
		
	
	}

}
© 2020 GitHub, Inc.