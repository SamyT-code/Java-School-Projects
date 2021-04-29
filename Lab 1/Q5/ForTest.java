public class ForTest {
		
	public static void main(String[] args) {
		//Pour cette question, je présume que la question me demande d'additioner les
		//nombres entiers de 1 à 10.
		int compteur = 0;
		for (int i = 1; i<=10; i++){
			compteur = compteur + i;			
		}
		System.out.println("La somme des 10 premiers chiffres 1 a 10 est: " + compteur);
	}
}