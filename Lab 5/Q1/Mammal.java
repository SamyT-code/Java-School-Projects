public class Mammal extends Animal{

	protected int nbMonthPregnacy;

	public Mammal(){

	}

	public Mammal(String name){
		super(name);
	}

	public String getType(){
		return super.getType() + "I am a Mammal. ";
	}

}