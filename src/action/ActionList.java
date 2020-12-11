package action;

public interface ActionList<E> extends Action<E> {
	
	 public String listTitle();
	 
	 public int size();
	 
	 public boolean addAction(Action<E> ac);
	
}
