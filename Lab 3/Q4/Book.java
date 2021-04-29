public class Book{
	private String author;
	private String title;

	private double price = -1;
	private boolean fixedPrice = false;

	public static Accountant accountant = new Accountant();

	public Book(){
	}

	public Book(String a, String t){
		this.author = a;
		this.title = t;
		//this.price = null;
	}

	public Book(String a, String t, double p){
		this.author = a;
		this.title = t;
		this.price = p;
		fixedPrice = true;
		accountant.count(this);
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public double getPrice(){
		return price;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPrice(double price){
		if( (price >= 0.0) && (fixedPrice != true) ){
			this.price = price;
			fixedPrice = true;
			accountant.count(this);
		}
		else{
			System.out.println("Le prix ne peut etre fixe qu'une seule fois et sa valeur doit etre superieure ou egale a 0");
		}
	}

	public boolean isFixedPrice(){
		
		if(fixedPrice == true){
			return true;
		}
	
		return false;	
	}

	public void affiche(){
		System.out.println(toString());
	}

	public String toString(){
		if(this.price < 0){
			return ("Error: negative price!");
		}
		else{
			return ("Book[title= " + this.title + ", author= " + this.author
				+ ", fixedPrice= " + this.isFixedPrice() + ", price= $" + this.price + "]");
		}
	}

	public Accountant getAccountant(){
		return accountant;
	}

}

/* QUESTION 2 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Book{
	private String author;
	private String title;

	private double price = -1;
	private boolean fixedPrice = false;

	public Book(){
	}

	public Book(String a, String t){
		this.author = a;
		this.title = t;
		//this.price = null;
	}

	public Book(String a, String t, double p){
		this.author = a;
		this.title = t;
		this.price = p;
		fixedPrice = true;
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public double getPrice(){
		return price;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPrice(double price){
		if( (price >= 0.0) && (fixedPrice != true) ){
			this.price = price;
			fixedPrice = true;
		}
		else{
			System.out.println("Le prix ne peut etre fixe qu'une seule fois et sa valeur doit etre superieure ou egale a 0");
		}
	}

	public boolean isFixedPrice(){
		
		if(fixedPrice == true){
			return true;
		}
	
		return false;	
	}

	public void affiche(){
		System.out.println(toString());
	}

	public String toString(){
		if(this.price == -1){
			return ("L'auteur est " + this.author + " et le titre est " + this.title + ". Prix pas encore fourni.");
		}
		else{
			return ("L'auteur est " + this.author + " et le titre est " + this.title + ". Le prix est: " + this.price + "$.");
		}
	}

}
*/