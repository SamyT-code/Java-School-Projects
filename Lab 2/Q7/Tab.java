public class Tab{

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

	public static int moyenne(int[] array){
		int compteur = 0;
		for(int i = 0; i < array.length; i++){
			compteur = compteur + array[i];
		}
		return compteur/(array.length); 
	}

	public static int count(int[] tab, int val){
		int compteur = 0;
		for(int i = 0; i < tab.length; i++){
			if (tab[i] < val){
				compteur = compteur + 1;
			}
		}
		return compteur;
	}

	public static void split(int[] tab, int[] petit, int val){
		for (int i = 0; i < tab.length && tab[i] < val; i++){
			petit[i] = tab[i];
		}

	}

	public static void main(String[] args){
		int tab1[] = { 3,55,7, 1, 88, 9 , 4, -10 };
		int[] tab2;
		tab2 = new int[] {10,34,62,56,82,7,95};

		trier(tab1);
		trier(tab2);

		System.out.print("Le tableau tab1 trie est : ");
		for (int i=0; i<tab1.length; i++){
			if (i>0){
				System.out.print(" ");
			}
			System.out.print(tab1[i]);
		}
		//System.out.print("}");
		System.out.println();

		System.out.print("Le tableau tab2 trie est : ");
		for (int i=0; i<tab2.length; i++){
			if (i>0){
				System.out.print(" ");
			}
			System.out.print(tab2[i]);
		}
		//System.out.print("}");
		System.out.println();

		System.out.println("La moyenne de tab2 est : " + moyenne(tab2));

		//int[] petitTab;
		//petitTab = new int[count(tab2, moyenne(tab2))];
		/*

		System.out.print("Les valeurs moins que la moyenne de tab 2 sont : {");
		for (int i=0; i<petitTab.length; i++){
			if (i>0){
				System.out.print(",");
			}
			System.out.print(tab2[i]);
		}
		System.out.print("}");
		System.out.println();

		//split(tab2, petitTab, moyenne(tab2));

		System.out.print("Les valeurs de petitTab sont : {");
		for (int i=0; i<petitTab.length; i++){
			if (i>0){
				System.out.print(",");
			}
			System.out.print(tab2[i]);
		}
		System.out.print("}");
		System.out.println(); */

		String msg = "";

		int[] petitTab = new int[count(tab2, moyenne(tab2))];
		split(tab2, petitTab, moyenne(tab2));

		for (int i = 0; i < petitTab.length; i++){
			msg += petitTab[i] + ", ";
		}

		msg = msg.substring(0, msg.length() - 2) ;
		System.out.println("Les valeurs de petitTab2 sont : " + msg);

	}

}