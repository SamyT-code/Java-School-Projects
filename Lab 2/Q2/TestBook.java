public class TestBook{

	public static void main(String [] args){
		Book b1 = new Book("Urasawa", "Pluto");
		Book b2 = new Book("Oda", "One Piece");
		System.out.println(b1.getAuthor());
		System.out.println(b2.getAuthor());
	}
}