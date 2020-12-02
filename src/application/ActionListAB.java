package application;

import java.awt.List;

import action.Action;
import action.ActionContext;
import action.ActionList;

public class ActionListAB<E> implements ActionList<E>{
	String title; 
	List<Action<AgenceBancaire>> myMenu;
	String dec;
	String decTwice; 
	String numberOptSep;
	
	public ActionListAB(String m, String c, String t) {
		
	}
	
	public String title() {
		
	}

	public String message() {
		// TODO Auto-generated method stub
		return null;
	}

	public String stringCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public int listSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void execute(ActionContext ac) {
		// TODO Auto-generated method stub
		
	}

	public boolean addActoin(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAction(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}

	public Action getAction(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int readResponse() {
		
	}
	
	private void printMenu() {
		
	}
	
	private void printTitle(AgenceBancaire ac) {
		
	}
	
	private void tempo() {
		
	}
	
	
	
}
