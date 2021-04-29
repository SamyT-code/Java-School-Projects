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

	public String getTitle(){
		return title;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setTitle(String title){
		this.title = title;
	}
}