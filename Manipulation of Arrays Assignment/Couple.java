public class Couple{

	private int p;
	private int q;

	public Couple(Couple c){
		this.p = c.p;
		this.q = c.q;
	}

	public Couple(){
		this.p = 0;
		this.q = 0;
	}

	public Couple(int p, int q){
		this.p = p;
		this.q = q;
	}

	public int getP(){
		return p;
	}

	public int getQ(){
		return q;
	}

	public void setP(int p){
		this.p = p;
	}

	public void setQ(int q){
		this.q = q;
	}

	public String display(){
		return ("(" + this.p + "," + this.q + ")");
	}

	public boolean compare(Couple other){
		return ( (this.p < other.p) || (this.p == other.p && this.q < other.q) );
	}

	/*public static void main(String[] args){
		Couple c1 = new Couple();
		Couple c2 = new Couple(c1);
		Couple c3 = new Couple(5,5);
		c1.display();
		c2.display();
		c3.display();
	}*/

}

