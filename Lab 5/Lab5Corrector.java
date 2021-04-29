import java.util.*; // Import for ArrayList, Stack and PriorityQueue
import java.io.*;   // Import for Scanner, File and FileWriter

public class Lab5Corrector{



	public static void main (String[] args){
	try{
		double score = 0;
		Scanner scan = new Scanner(System.in);
		File testResult = new File("Correction.txt");	
		if (testResult.createNewFile()) {
			System.out.println("File created: " + testResult.getName());
		} 
		else {
			System.out.println("File already exists.");
		}
	
		
	
		FileWriter myWriter = new FileWriter(testResult);
		
		//intro
		myWriter.write("ITI1521 - Section A02\n");
		myWriter.write("Correction du Lab #5\n");
		myWriter.write("AE: Benoit Vanasse\n");
		myWriter.write("Courriel: bvana069@uottawa.ca\n");
		myWriter.write("Note: Pour toutes questions, veuillez ME contacter via MS Teams et non le professeur.\n");
		myWriter.write(System.getProperty( "line.separator" ));
		
		//Q1
		myWriter.write("Question 1.1: Animal.java\n\n" );
	
		//Test 1.1
		myWriter.write("Constructor Aucun Parameter avec getType()\n" );
		Animal A1 = new Animal();
		if(A1.name == null) {
			myWriter.write("Constructor Aucun Parameter Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(A1.getType().equals("I am an animal. ")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n" );
		
		
		//Test 1.2
		myWriter.write("Constructor Un Parameter avec getType()\n" );
		Animal A2 = new Animal("Benoit");
		if(A2.name.equals("Benoit")) {
			myWriter.write("Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(A2.getType().equals("I am an animal and my name is " + A2.name + ". ")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n\n" );
		
		
		myWriter.write("Question 1.2: Mammal.java\n\n" );
		
		//Test 1.3
		myWriter.write("Constructor Aucun Parameter avec getType()\n" );
		Mammal M1 = new Mammal();
		if(M1.name == null) {
			myWriter.write("Constructor Aucun Parameter Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(M1.getType().equals("I am an animal. I am a Mammal. ")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n" );
		
		//Test 1.4
		myWriter.write("Constructor Un Parameter avec getType()\n" );
		Mammal M2 = new Mammal("George");
		if(M2.name.equals("George")) {
			myWriter.write("Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(M2.getType().equals("I am an animal and my name is " + M2.name + ". I am a Mammal. ")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n\n" );
		
		
		myWriter.write("Question 1.3: Dog.java\n\n" );
		
		//Test 1.5
		myWriter.write("Constructor Aucun Parameter avec getType()\n" );
		Dog D1 = new Dog();
		
		if(D1.name == null) {
			myWriter.write("Constructor Aucun Parameter Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(D1.nbMonthPregnacy == 3){
			myWriter.write("nbMonthPregnacy Test Passed! (+0.1pt)\n" );
			score += 0.1;
		} else {myWriter.write("nbMonthPregnacy Test Failed...\n" );}
		
		if(D1.getType().equals("I am an animal. I am a Mammal. I am a dog")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n" );
		
		//Test 1.6
		myWriter.write("Constructor Un Parameter avec getType()\n" );
		Dog D2 = new Dog("Billy");
		if(D2.name.equals("Billy")) {
			myWriter.write("Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(D2.nbMonthPregnacy == 0){
			myWriter.write("nbMonthPregnacy Test Passed! (+0.1pt)\n" );
			score += 0.1;
		} else {myWriter.write("nbMonthPregnacy Test Failed...\n" );}
		
		if(D2.getType().equals("I am an animal and my name is " + D2.name + ". I am a Mammal. I am a dog")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n\n" );
		
		myWriter.write("Question 1.4: Cat.java\n\n" );
		
		//Test 1.7
		myWriter.write("Constructor Aucun Parameter avec getType()\n" );
		Cat C1 = new Cat();
		
		if(C1.name == null) {
			myWriter.write("Constructor Aucun Parameter Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(C1.nbMonthPregnacy == 2){
			myWriter.write("nbMonthPregnacy Test Passed! (+0.1pt)\n" );
			score += 0.1;
		} else {myWriter.write("nbMonthPregnacy Test Failed...\n" );}
		
		if(C1.getType().equals("I am an animal. I am a Mammal. I am a cat.")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n" );
		
		//Test 1.8
		myWriter.write("Constructor Un Parameter avec getType()\n" );
		Cat C2 = new Cat("Kelly");
		if(C2.name.equals("Kelly")) {
			myWriter.write("Test Passed! (+0.2pt)\n" );
			score += 0.2;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(C2.nbMonthPregnacy == 0){
			myWriter.write("nbMonthPregnacy Test Passed! (+0.1pt)\n" );
			score += 0.1;
		} else {myWriter.write("nbMonthPregnacy Test Failed...\n" );}
		
		if(C2.getType().equals("I am an animal and my name is " + C2.name + ". I am a Mammal. I am a cat.")){
			myWriter.write("getType() Test Passed! (+0.2pt)\n\n" );
			score += 0.2;
		}
		else myWriter.write("getType() Test Failed...\n\n" );
		
		
		
	
		//Q2
		myWriter.write("Question 2.1: Employee.java" );
		myWriter.write(System.getProperty( "line.separator" ));
		
		//Test 2.1
		myWriter.write("Constructor Un Parameter\n" );
		Employee E1 = new Employee("Charles");
		
		if(E1.getName().equals("Charles")) {
			myWriter.write("Constructor Un Parameter Test Passed! (+0.8pt)\n" );
			score += 0.8;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(E1.toString() != null){
			myWriter.write("Constructor Un Parameter toString() Test Passed! (+0.7pt)\n\n" );
			score += 0.7;
		}
		else myWriter.write("Test Failed...\n\n" );
		
		
		
		myWriter.write("Question 2.2: Contract.java" );
		myWriter.write(System.getProperty( "line.separator" ));
		
		//Test 2.2
		myWriter.write("Constructor Un Parameter\n" );
		Contract Con1 = new Contract("John");
		
		if(Con1.getName().equals("John") && Con1.getNbHours() == 0.0 && Con1.getHourRate() == 0.0) {
			myWriter.write("Constructor Un Parameter Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(Con1.toString() != null){
			myWriter.write("Constructor Un Parameter toString() Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(Con1.getSalary() == 0.0){
			myWriter.write("Constructor Un Parameter getSalary() Test Passed! (+0.3pt)\n\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n\n" );
		
		
		//Test 2.3
		myWriter.write("Constructor 4 Parameter\n" );
		double myNbHours = 1.0;
		double myHourRate = 1.0;
		double myPercent = 0.3;
		Contract Con2 = new Contract("Johnny", myNbHours, myHourRate, myPercent);
		
		if(Con2.getName().equals("Johnny") && Con2.getNbHours() == myNbHours && Con2.getHourRate() == myHourRate && Con2.getPercentHourSup() == myPercent) {
			myWriter.write("Constructor 4 Parameter Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(Con2.toString() != null){
			myWriter.write("Constructor 4 Parameter toString() Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(Con2.getSalary() == 1.0){
			myWriter.write("Constructor 4 Parameter getSalary() Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		Con2.setSalaryInfo(41.0,1.0,0.3);
		if(Con2.getSalary() == 41.3 || Con2.getSalary() == 40.3 || Con2.getSalary() == 42.3){
			myWriter.write("Constructor 4 Parameter setSalaryInfo() Test Passed! (+0.3pt)\n\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n\n" );
		
		
		myWriter.write("Question 2.3: FullTime.java" );
		myWriter.write(System.getProperty( "line.separator" ));
		
		//Test 2.4
		myWriter.write("Constructor Un Parameter\n" );
		FullTime FT1 = new FullTime("Roger");
		
		if(FT1.getName().equals("Roger")) {
			myWriter.write("Constructor Un Parameter Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(Con1.toString() != null){
			myWriter.write("Constructor Un Parameter toString() Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(Con1.getSalary() == 0.0){
			myWriter.write("Constructor Un Parameter getSalary() Test Passed! (+0.3pt)\n\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n\n" );
		
		
		//Test 2.3
		myWriter.write("Constructor 4 Parameter\n" );
		double pay = 1.0;
		double turnover = 1.0;
		double percentTurnover = 0.3;
		FullTime FT2 = new FullTime("Johnny", pay, turnover, percentTurnover);
		
		if(FT2.getName().equals("Johnny") && FT2.getSalary() == 1.3) {
			myWriter.write("Constructor 4 Parameter Test Passed! (+0.4pt)\n" );
			score += 0.4;
		}
		else myWriter.write("Test Failed...\n" );
		
		if(FT2.toString() != null){
			myWriter.write("Constructor 4 Parameter toString() Test Passed! (+0.4pt)\n" );
			score += 0.4;
		}
		else myWriter.write("Test Failed...\n" );
		
		FT2.setPay(2.0);
		FT2.setTurnover(2.0);
		
		if(FT2.getSalary() == 2.6){
			myWriter.write("Constructor 4 Parameter setPay()/setTunrover() Test Passed! (+0.3pt)\n" );
			score += 0.3;
		}
		else myWriter.write("Test Failed...\n" );		
		
		FT2.setSalaryInfo(41.0,1.0);
		if(FT2.getSalary() == 41.3){
			myWriter.write("Constructor 4 Parameter setSalaryInfo() Test Passed! (+0.4pt)\n\n" );
			score += 0.4;
		}
		else myWriter.write("Test Failed...\n\n" );
		
		
	
		myWriter.write(System.getProperty( "line.separator" ));
		myWriter.write(System.getProperty( "line.separator" ));
	
		//Final
		score = round(score,1);
		myWriter.write("Votre result finale est: " + score);
		myWriter.write(System.getProperty( "line.separator" ));
		if(score >= 10){myWriter.write("Excellent!");}
		else if(score > 7){myWriter.write("Quelque erreurs, faite attention sur le prochain lab!");}
		else if(score > 4){myWriter.write("Plusieur erreurs, doubler vos efforts pour le prochain lab!");}
		else{myWriter.write("Je vous conseille fortement de doubler vos efforts, utiliser les resources disponible pour vous ameliorer!");}
		if(score < 8){
		myWriter.write("\nSi vous pensez qu'il y a une erreur, voici ce que vous devez faire:\n");
		myWriter.write("1. Comparez votre code à celui de la solution de BrightSpace et trouver le probleme.\n");
		myWriter.write("2. Si vous pensez toujours qu'il y a une erreur, contactez-moi via MS Teams avec le numéro de la question.\n");
		}
		myWriter.close();
		
		
			
		}//end of main try
		catch (IOException e) {
			System.out.println("Error while in save.");
		}	

	}//end of main
	
	private static double round (double value, int precision) {
    int scale = (int) Math.pow(10, precision);
    return (double) Math.round(value * scale) / scale;
}

}//end of Lab3Corrector
