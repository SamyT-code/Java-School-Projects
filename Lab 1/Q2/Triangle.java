public class Triangle {
	static void myMethod(int x){
		for (int n = 1; n<=x; n++){
			System.out.print(n);
		}
		
	}
	
	public static void main(String[] args) {

		for (int i = 1; i<=5; i++){
			myMethod(i);
			System.out.println("");
		}
		//myMethod(5);
	}
}