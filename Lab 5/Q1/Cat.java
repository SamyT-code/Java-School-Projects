public class Cat extends Mammal{

	public Cat(){
		this.nbMonthPregnacy = 2;
		System.out.println("I am a cat and just born after 2 months of pregnancy. I don't have a name yet.");
	}

	public Cat(String name){
		super(name);
	}

	public String getType(){
		return super.getType() + "I am a cat.";
	}

}