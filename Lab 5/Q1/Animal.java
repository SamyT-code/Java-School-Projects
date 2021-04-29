public class Animal{

	protected String name = null;

	public Animal(){ // Constructeur sans paramètres

	}

	public Animal(String name){ // Constructeur avec 1 paramètre
		this.name = name;
	}

	public String getType(){
		if(name == null){
			return "I am an animal. ";
		}
		else{
			return "I am an animal and my name is " + this.name + ". ";
		}
	}

}