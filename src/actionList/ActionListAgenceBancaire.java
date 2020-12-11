package actionList;

import java.util.ArrayList;
import java.util.Scanner;

import action.Action;
import action.ActionContext;
import action.ActionList;
import banque.AgenceBancaire;

public class ActionListAgenceBancaire<E> implements ActionList<E>{

    private String message;
    private String code;
    private String title;
    private ArrayList<Action<AgenceBancaire>> listeActions;

    public ActionListAgenceBancaire(String message,String title, ArrayList<Action<AgenceBancaire>> listeActions) {
        this.message = message;
        this.code = "0";
        this.title = title;
        this.listeActions = listeActions;
    }

    
    public String actionMessage() {
        return message;
    }

 
    public String actionCode() {
        return code;
    }

    public void execute(E e) throws Exception {

        while(code != "-1") {
            System.out.println("--");
            System.out.println("Agence "+((AgenceBancaire) e).getNomAgence()+" de "+((AgenceBancaire) e).getLocAgence());
            System.out.println("Menu "+listTitle());
            System.out.println("--");
            System.out.println("\n  Choisir :");

            for (int i = 0; i < listeActions.size(); i++) {

                System.out.println("    "+(i+1)+" - "+listeActions.get(i).actionMessage());

            }
            System.out.println("\n    0 - Pour quitter ce menu");
            System.out.println("Choisir");
            Scanner scan = new Scanner(System.in);
            int rep = scan.nextInt();

            if(rep != 0) {
                listeActions.get(rep-1).execute((AgenceBancaire)e);

            }else {
                code = "-1";
            }
        }
        this.code = "0";
        System.out.println("Fin de "+this.message);



    }
    
    public String listTitle() {
        return title;
    }

    
    public int size() {
        return listeActions.size();
    }



    public boolean addAction(Action ac) {
        for (Action action : listeActions) {
            if(ac.actionMessage().equals(action.actionMessage())) {
                return false;
            }
        }
        listeActions.add(ac);
        return true;
    }

	public void execute(ActionContext<E> ac) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
