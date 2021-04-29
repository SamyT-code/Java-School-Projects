public class Dog extends Mammal{

	public Dog(){
		this.nbMonthPregnacy = 3;
		System.out.println("I am a dog and just born after 3 months of pregnancy. I don't have a name yet.");
	}

	public Dog(String name){
		super(name);
	}

	public String getType(){
		return super.getType() + "I am a dog";
	}

}