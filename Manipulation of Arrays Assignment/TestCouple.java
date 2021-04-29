public class TestCouple{

	public static void main(String[] args){
		Couple c1 = new Couple(2,3);
		Couple c2 = new Couple(0,0);
		Couple c3 = new Couple(2,3);

		System.out.println(c1.display());
		System.out.println(c2.display());
		System.out.println(c3.display());

		c3.setP(8);
		//c3.display();

		System.out.println("Apres modification, les elements de c3 sont : " + c3.getP() + " , " + c3.getQ()); 
		System.out.println("c1 est inferieur a c3 : " + c1.compare(c3) );

	}

}