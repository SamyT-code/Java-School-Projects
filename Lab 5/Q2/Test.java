public class Test{

	public static void main(String[] args){

		// Crééer le tableau d'employés
		Employee[] tab = new Employee[4];
		tab[0] = new FullTime("Tisham");
		tab[1] = new FullTime("Christina", 5000, 50, 1);
		tab[2] = new Contract("Sushma", 30, 65, 50);
		tab[3] = new Contract("Correcteur", 40, 60, 40);

		for (int i=0; i<tab.length; i++){
			System.out.println(tab[i] + "\n");
		}
	}

}