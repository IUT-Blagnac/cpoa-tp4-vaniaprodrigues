package action;

import banque.AgenceBancaire;

public class ActionListeDesComptes<E> implements Action<E>{

    private String message;
    private String code;

    public ActionListeDesComptes(String message) {
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
        ((AgenceBancaire) e).afficher();
    }

	public void execute(ActionContext<E> ac) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
© 2020 GitHub, Inc.