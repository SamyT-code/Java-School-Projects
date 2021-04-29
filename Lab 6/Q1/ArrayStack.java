public class ArrayStack<E> implements Stack<E>{

	private E[] elems;
	private int top;

	@SuppressWarnings("Unchecked")
	public ArrayStack(int size){
		top = 0;
		elems = (E[]) new Object[size];
	}

	public boolean isEmpty(){
		return top == 0;
	}

	public E peek(){
		// precondition: the stack is not empty
		return elems[top-1];
	}

	public E pop(){
		// precondition: the stack is not empty
		E saved;
		top--;
		saved = elems[top];
		elems[top] = null;
		return saved;
	}

	public void push(E elem){
		//precondition: not full
		elems[top] = elem;
		top++;
	}

	public void clear(E item){ //Ça ne fait pas de sens que clear() prends des paramètres
		while(!isEmpty()){
			pop();
		}
	}

	public void clear(){ // Créer un clear sans paramètres
		while(!isEmpty()){
			pop();
		}
	}

}