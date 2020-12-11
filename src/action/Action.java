package action;

public interface Action<E> {
 
	public String actionMessage();
	
	public String actionCode();
	
	public void execute(ActionContext<E> ac) throws Exception;

	void execute(E e) throws Exception;
}
