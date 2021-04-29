public class Somme{
		
	public static void main(String[] args) {

		int[] argsInt = new int[args.length];
		int somme = 0;

		for(int i = 0; i < args.length; i++){
			//System.out.println(args[i]);
			argsInt[i] = Integer.parseInt(args[i]);
			//System.out.println("Ints: " + argsInt[i]);
			somme = somme + argsInt[i];
		}

		System.out.println("La somme est " + somme);

		
	}
}