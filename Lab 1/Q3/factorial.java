public class factorial {

	static int myMethod(int x){
		int compteur = 1;
		for (int i = 1; i<=x; i++){
			compteur = compteur * i;			
		}

		return compteur;
	}
		
	public static void main(String[] args) {

		System.out.println(myMethod(Integer.parseInt(args[0])));
	}
}