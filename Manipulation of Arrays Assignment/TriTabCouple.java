public class TriTabCouple{

	public static void bubbleSort(Couple[] tab){
		int n = tab.length;
		for (int i = 0; i < n -1; i++){
			for (int j = 0; j < n -i-1; j++){
				if (!tab[j].compare(tab[j+1])){
					Couple temp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = temp;
				}
			}
		}

	}

	public static void insertSort(Couple[] tab){
		int n = tab.length;
		for (int i = 1; i < n; i++){
			Couple key = tab[i];
			int j = i - 1;
			while (j >= 0 && !tab[j].compare(tab[j+1])){
				tab[j + 1] = tab[j];
				j = j - 1;
			}
			tab[j + 1] = key;
		}
		
	}

	public static void main(String[] args){
		Couple c1 = new Couple(2,3);
		Couple c2 = new Couple(0,5);
		Couple c3 = new Couple(2,5);

		c1.display();
		c2.display();
		c3.display();

		Couple[] tableau = new Couple[]{c1, c2, c3};
		//System.out.println(tableau);
		insertSort(tableau);
		System.out.print("Mon tableau trie est : {");
		for (int i = 0; i < tableau.length; i++){
			System.out.print(tableau[i].display());
			if(i < tableau.length - 1){
				System.out.print(" , ");
			}
		}
		System.out.print("}");
		System.out.println();
	}
}

/*
Couple min, tmp;
		for(int i = 0; i < tab.length - 1; i++){
			min = tab[i];
			for(int j = i + 1; j < tab.length; j++){
				if (!tab[i].compare(tab[j])){
					min = tab[j];
				}
			}
		tmp = min;
		min = tab[i];
		tab[i] = tmp;
		}
		
*/