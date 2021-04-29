public class Test{

	public static void main(String[] args){
		
		ArrayStack<String> tab = new ArrayStack<String>(10);

		
		for(int i=0; i < 10; i++){
			tab.push("First time: " + String.valueOf(i));
		}

		System.out.println(tab.pop() + "\n");

		System.out.println("Checking before clearing: "+tab.isEmpty() + "\n");

		tab.clear();

		System.out.println("Checking after clearing: "+tab.isEmpty() + "\n");

		System.out.println("Empiler à nouveau la pile");

		for(int i=0; i < 10; i++){
			tab.push("Second time: " + String.valueOf(2*i));
		}

		while(!tab.isEmpty()){
			System.out.println(tab.pop());
		}

	}

}