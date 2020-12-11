package action;
import java.util.Scanner;

import banque.AgenceBancaire;
import banque.Compte;

public class ActionRetirerArgent<E> implements Action<E>{
    String message;
    String code;


    public ActionRetirerArgent(String message) {
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
        System.out.println("Saisir num�ro du compte:");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        System.out.println("Saisir le montant � retirer");
        double reti = scan.nextDouble();

        ((AgenceBancaire)e).getCompte(num).retirer(reti);

    }

	public void execute(ActionContext<E> ac) throws Exception {
		// TODO Auto-generated method stub
		
	}
}