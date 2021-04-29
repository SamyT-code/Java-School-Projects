//Enlevez le seul constructeur de la classe Book . Sans ajouter de nouveau
//constructeur, peut-on quand même créer un nouveau objet de type Book dans la
//méthode main ? Si c'est possible, créez un Objet de type Book et faites afficher
//son titre et son auteur.
//Remettez le constructeur que vous avez enlevé. Est-ce que le code de la
//méthode main de la question précédente fonctionne toujours?

//Réponse à la première question: OUI, il est possible de créer un objet de type Book dans main
//Réponse à la deuxième question: NON, le code de la méthode main ne fonctionne PAS.


public class Book{
	private String author;
	private String title;
	
	//public Book(String a, String t){
	//	this.author = a;
	//	this.title = t;
	//}

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

	public static void main(String[] args){
		Book b1 = new Book();
		b1.setTitle("Les schtroumpfs");
		b1.setAuthor("Peyo");

		System.out.println("Titre: " + b1.title + ". " + "Auteur: " + b1.author);
	}
}