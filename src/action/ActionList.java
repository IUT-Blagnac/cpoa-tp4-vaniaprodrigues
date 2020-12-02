package action;

public interface ActionList<E> extends Action<E> {
	
	public String title();
	
	boolean addActoin(Action<E> ac);
	
	boolean removeAction(Action<E> ac);
	
	int listSize();
	
	Action<E> getAction( int index);
	
}
