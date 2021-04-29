public class Employee{

	protected final String name;

	public Employee(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public double getSalary(){
		return 0; //change this later
	}

	public String toString(){
		if(this.getSalary() != 0){
			return this.name + " earns " + getSalary() + "$";
		}
		else{
			return this.name + " has an unspecefied pay";
		}
	}

}