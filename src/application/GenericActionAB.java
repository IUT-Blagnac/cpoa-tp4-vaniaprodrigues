package application;

import action.Action;

public abstract class GenericActionAB<E> implements Action<E> {

	String lineMessage; 
	String code; 
	
	public GenericActionAB(String m, String c) {
		
	}
	
	public String message() {
		return null;
	}
	
	public String stringCode() {
		return null; 
	}
	
	public void execute(ActionContext<AgenceBancaire> ac) {
		
	}
}
