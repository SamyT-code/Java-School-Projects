public class Book{
	private String author;
	private String title;
	
	public Book(String a, String t){
		this.author = a;
		this.title = t;
	}

	public Book(){

	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void affiche(){
		System.out.println(toString());
	}

	public String toString(){
		return ("L'auteur est " + this.author + " et le titre est " + this.title);
	}

}