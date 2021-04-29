public class FullTime extends Employee{

	private double pay = 0;
	private double turnover = 0;
	private double percentTurnover = 1;

	public FullTime(String name){
		super(name);
	}

	public FullTime(String name, double pay, double turnover, double percentTurnover){
		super(name);
		this.pay = pay;
		this.turnover = turnover;
		this.percentTurnover = percentTurnover;
	}

	//public void setSalaryInfo(double pay, double turnover, double percentTurnover){
	public void setSalaryInfo(double pay, double turnover){
		this.pay = pay;
		this.turnover = turnover;
		this.percentTurnover = percentTurnover;
	}

	public void setTurnover(double percentTurnover){
		this.percentTurnover = percentTurnover;
	}

	public void setPay(double pay){
		this.pay = pay;
	}

	public double getSalary(){
		return pay + turnover * percentTurnover/100;
	}

	public String toString(){
		return super.toString() + " (employee permanent)";
	}

	/*NOTE: Pour la méthode toString(), il est demandé de faire
	"une méthode toString qui doit afficher le nombre d’heures travaillés par
	semaine, le tarif horaire et le pourcentage pour les heures supplémentaires."

	Cependant, il n'y a pas ces attributs appartiennent aux employés de contrat
	(la personne qui a écrit le lab a dû faire une erreur) JMai donc cimplement spécifié 
	que cette personne est un employé de contract. Sinon, jaurais pus faire:

	public String toString(){
		return super.toString() + " (employee permanent. " + pay + 
		" $ de paye, " + turnover + "$ de turnover, " + percentTurnover + 
		"% par de Turnover)";
	}
	*/
}