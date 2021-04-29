public class TestBook{

	public static void main(String [] args){
		Book b1 = new Book("Urasawa", "Pluto");
		Book b2 = new Book();
		Book book = new Book("Stewart", "Calculus I");
		//System.out.println(b1.getAuthor());
		//System.out.println(b2.getAuthor());

		b1.affiche();
		b2.affiche();
		System.out.println(book);

	}
}