public class Accountant{

	private double totalPrice = 0;

	public Accountant(){

	}

	public double getTotalPrice(){
		return totalPrice;
	}

	public void count(Book b){
		if(b.isFixedPrice() == true){
			totalPrice = totalPrice + b.getPrice();
		} 
	}
}