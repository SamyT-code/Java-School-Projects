public class TestBook{

	public static void main(String [] args){
		Book b1 = new Book("Urasawa", "Pluto");
		Book b2 = new Book();
		Book book = new Book("Stewart", "Calculus I");
		Book livre = new Book("Pierce", "Big Nate", 22.50);
		//System.out.println(b1.getAuthor());
		//System.out.println(b2.getAuthor());

		System.out.println("b1 affiche: ");
		b1.affiche();

		System.out.println("b2 affiche: ");
		b2.affiche();

		System.out.println("Le prix de b1 (devrait etre -1.0): ");
		System.out.println(b1.getPrice());

		System.out.println("Imprimer book: ");
		System.out.println(book);

		System.out.println();
		System.out.println("1) afficher livre. 2) getprice. 3) essayer de changer le prix a 200$ (le prix ne devrait pas changer) 4) get price encore. 5) print livre");
		livre.affiche();
		System.out.println(livre.getPrice());
		livre.setPrice(200);
		System.out.println(livre.getPrice());
		System.out.println(livre);

		System.out.println();
		System.out.println("Voir si b1 a un prix fixe");
		System.out.println(b1.isFixedPrice());

		System.out.println("Donner un prix b1 (123$). Voir si b1 a un prix fixe, imprimer ce prix");
		b1.setPrice(123);
		System.out.println(b1.isFixedPrice());
		System.out.println(b1.getPrice());

		System.out.println("Donner un nouveau prix a b1 (456$). Voir si b1 a un prix fixe, imprimer ce prix");
		b1.setPrice(456);
		System.out.println(b1.isFixedPrice());
		System.out.println(b1.getPrice());
		System.out.println("Comme on peut le voir, le prix de b1 n'a pas change");



	}
}