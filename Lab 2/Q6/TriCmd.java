public class TriCmd{

	public static void trier(int[] tab){
		int i, j, min, tmp;
		for (i=0; i < tab.length -1; i++){
			min = i;
			for (j = i+1; j < tab.length; j++){
				if (tab[j] < tab[min]){
					min = j;
				}
			}
			tmp = tab[min];
			tab[min]=tab[i];
			tab[i]=tmp;
		}
	}

	public static void main(String[] args){
		int[] argsInt = new int[args.length];

		for (int i = 0; i < args.length; i++){
			argsInt[i] = Integer.parseInt(args[i]);
		}

		trier(argsInt);
		System.out.print("Le tableau trie est : {");
		for (int i=0; i<argsInt.length; i++){
			if (i>0){
				System.out.print(",");
			}
			System.out.print(argsInt[i]);
		}
		System.out.print("}");
		System.out.println();

	}
}