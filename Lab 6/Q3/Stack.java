public interface Stack<E>{

	public abstract boolean isEmpty();
	public abstract E peek();
	public abstract E pop();
	public abstract void push(E item);
	//Ça ne fait pas de sens que clear() prends des paramètres
	public abstract void clear(E item); 

}