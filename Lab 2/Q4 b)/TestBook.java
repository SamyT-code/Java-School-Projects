public class TestBook{

	public static void main(String [] args){
		Book bb1 = new Book("Urasawa", "Pluto");
		Book bb2 = new Book();
		System.out.println(bb1.getAuthor());
		System.out.println(bb2.getAuthor());
	}
}