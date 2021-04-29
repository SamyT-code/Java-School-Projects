public class Use{

	public static String[] replace(String[] tabIn, String[] tab, String[] tabOut){

		//Vérifier si les tableaux ne sont pas null
		if(tabIn == null || tab == null || tabOut == null){
			return null;
		}

		//Vérifier si les éléments des tableaux ne sont pas null
		String[][] verify = {tabIn, tab, tabOut}; 
		for(int i = 0; i < verify.length; i++){
			for(int j = 0; j < verify[i].length; j++){
				if(verify[i][j] == null){
					return null;
				}
			}
		}

		//Vérifier si tab et tabOut ont la même longueur
		if(tab.length != tabOut.length){
			return null;
		}		

		// Déclarer la variable retour qui sera retournée
		String[] retour = new String[tabIn.length];

		//Voir quelles éléments du tabIn se répètent dans tab
		for(int i = 0; i < tabIn.length; i++){
			for(int j = 0; j < tab.length; j++){
				//Si les éléments se répètent, prendre l'élément du tabOut pour cette index
				if(tabIn[i].equals(tab[j])){
					//System.out.println(tabIn[i]);
					retour[i] = tabOut[j];
				}
				//Si les éléments ne re répètent pas, simplement prender l'élément de tabIn
				else{
					retour[i] = tabIn[i];
				}
			}
		}

		return retour;
	}

	public static void main(String[] args){

		//Créer les tableaux 
		//String[] tabIn = new String[]{};
		String[] tabIn = new String[]{"Book", "off", "I"};
		String[] tab = new String[]{"Java", "C++", "off"};
		String[] tabOut = new String[]{"Id", "Name", "my"};

		System.out.println("Voici de quoi ont l'air les tableaux avant d'etre traites: ");
		//Imprimer tabIn
		System.out.print("{");
		for(int i = 0; i < tabIn.length; i++){
			System.out.print(tabIn[i]);
			if(i < tabIn.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();

		//Imprimer tab
		System.out.print("{");
		for(int i = 0; i < tab.length; i++){
			System.out.print(tab[i]);
			if(i < tab.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();

		//Imprimer tabOut
		System.out.print("{");
		for(int i = 0; i < tabOut.length; i++){
			System.out.print(tabOut[i]);
			if(i < tabOut.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();
		System.out.println();

		//affecter à la variable clean la valeur de retour de la méthode replace
		String[] clean = replace(tabIn, tab, tabOut);

		//Imprimer les éléments de clean
		System.out.println("Voici de quoi a l'air le tableau quand il est traite: ");
		System.out.print("{");
		if(clean != null){
			for(int i = 0; i < clean.length; i++){
				System.out.print(clean[i]);
				if(i < clean.length-1){
					System.out.print(", ");
				}
			}
		}
		System.out.print("}");

	}

}