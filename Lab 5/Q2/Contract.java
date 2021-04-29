public class Contract extends Employee{

	private double nbHours = 0;
	private double hourRate = 0;
	private double percentHourSup = 0;
	private static final double dueHour = 40;

	public Contract(String name){
		super(name);
	}

	public Contract(String name, double nbHours, double hourRate, double percentHourSup){
		super(name); // EST CE QUE CELA FONCTIONNE??
		this.setSalaryInfo(nbHours, hourRate, percentHourSup);
	}

	public void setSalaryInfo(double nbHours, double hourRate, double percentHourSup){
		this.nbHours = nbHours;
		this.hourRate = hourRate;
		this.percentHourSup = percentHourSup;
	}

	public double getNbHours(){
		return this.nbHours;
	}

	public double getHourRate(){
		return this.hourRate;
	}

	public double getPercentHourSup(){
		return this.percentHourSup;
	}

	public double getSalary(){
		return dueHour*hourRate + (nbHours - dueHour) * (1 + percentHourSup/100) * hourRate;
	}

	public String toString(){
		//return nbHours+ " heures travaillee par semaine, " + hourRate+ "$ par heure " + percentHourSup + 
		//"% par heures supplementaires.";
		return super.toString() + " (employee contractuel. " + nbHours + 
		" heures travaillee par semaine, " + hourRate+ "$ par heure, " + percentHourSup + 
		"% par heures supplementaires)";
	}
	
}