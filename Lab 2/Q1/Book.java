public class Book{
	private String author;
	private String title;
	
	public Book(String a, String t){
		this.author = a;
		this.title = t;
	}

	public String getAuthor(){
		return author;
	}

	public static void main(String[] args){
		Book b1 = new Book("Orwell", "Animal Farm");
		Book b2 = new Book("Herge", "Tintin");
		System.out.println(b1.getAuthor());
		System.out.println(b2.getAuthor());
	}
} 