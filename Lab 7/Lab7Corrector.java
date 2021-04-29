import java.util.*; // Import for ArrayList, Stack and PriorityQueue
import java.io.*;   // Import for Scanner, File and FileWriter
import java.util.Arrays;

public class Lab7Corrector{



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
		myWriter.write("Correction du Lab #7\n");
		myWriter.write("AE: Benoit Vanasse\n");
		myWriter.write("Courriel: bvana069@uottawa.ca\n");
		myWriter.write("Note: Pour toutes questions, veuillez ME contacter via MS Teams et non le professeur.\n");
		myWriter.write(System.getProperty( "line.separator" ));
		
		
		        //Q1
		myWriter.write("Question 1\n\n" );
		
		//Test 1.1
		myWriter.write("Compilation Correct Test\n" );
		System.out.println("Did the Question1 compile correctly? y/n");
		String answer = scan.nextLine();
		
		if(answer.equals("y") || answer.equals("Y")) {
			score += 0.5; 
			myWriter.write("Compilation Correct Test Passed! (+0.5pt)\n" );
			
			//Test 1.2
			myWriter.write("Correct Input Test\n" );
			System.out.println("Input 3 characters and press Enter.");
			Question1.main(new String[0]);
			System.out.println("Did you get 5 as result? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 0.5; myWriter.write("Correct Input Test Passed! (+0.5pt)\n\n" );}
			else myWriter.write("Test 1.2 Failed...\n\n" );
		}
		
		else myWriter.write("Test 1.1, 1.2 Failed...\n\n" );
		
		
		
		
		//Q2
		myWriter.write("Question 2\n\n" );
		
		//Test 2.1
		myWriter.write("Compilation Correct Test\n" );
		System.out.println("\n-----\nDid the Question2 compile correctly? y/n");
		answer = scan.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			score += 0.5; 
			myWriter.write("Compilation Correct Test Passed! (+0.5pt)\n" );
			
			System.out.println("For this section, you need to do three different entries.");
			System.out.println("Test 2.2: Enter 4 as the index value and you should receive a result of 100.");
			System.out.println("Test 2.3: Enter 999 as the index value and you should receive an array out of bound exception.");
			System.out.println("Test 2.4: Enter asdf as the index value and you should receive a number format exception.");
			System.out.println("After you are done all those 3 entries, type \"end\" to terminate.");
			Question2.main(new String[0]);
			
			//Test 2.2
			myWriter.write("Correct Index Result Test\n" );
			System.out.println("Did you get 100 as result? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 0.5; myWriter.write("Correct Index Result Test Passed! (+0.5pt)\n\n" );}
			else myWriter.write("Test 2.2 Failed...\n" );
			
			//Test 2.3
			myWriter.write("Array Out-Of-Bound Test\n" );
			System.out.println("Did you get array out of bound exception? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 0.5; myWriter.write("Array Out-Of-Bound Test Passed! (+0.5pt)\n\n" );}
			else myWriter.write("Test 2.3 Failed...\n" );
			
			//Test 2.4
			myWriter.write("Number Format Test\n" );
			System.out.println("Did you get number format exception? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 0.5; myWriter.write("Number Format Test Passed! (+0.5pt)\n\n" );}
			else myWriter.write("Test 2.4 Failed...\n\n" );
			
		}
		
		else myWriter.write("Test 2.1, 2.2, 2.3, 2.4 Failed...\n\n" );
		
		
		//Q3
		myWriter.write("Question 3\n\n" );
		
		//Test 3.1
		myWriter.write("Compilation Correct Test\n" );
		System.out.println("\n-----\nDid the Question3 compile correctly? y/n");
		answer = scan.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			score += 1.0; 
			myWriter.write("Compilation Correct Test Passed! (+1.0pt)\n" );
			
			//Test 3.2
			myWriter.write("Correct Input Returned Test\n" );
			System.out.println("Enter a lot of text.");
			byte[] myByte = null;
			try{myByte = Question3.getInput();} catch(Exception e){}
			// System.out.println(Arrays.toString(myByte));
			// System.out.println("");
			// System.out.println("Did a long array of integer print? y/n");
			// answer = new String(scan.nextLine());
			// if(answer.equals("y") || answer.equals("Y")) {score += 1.0; myWriter.write("Correct Input Returned Test Passed! (+1.0pt)\n\n" );}
			if(myByte.length > 5) {score += 1.0; myWriter.write("Correct Input Returned Test Passed! (+1.0pt)\n\n" );}
			else myWriter.write("Test 3.2 Failed...\n\n" );
			
		}
		
		else myWriter.write("Test 3.1, 3.2 Failed...\n\n" );
		
		answer = scan.nextLine();
		
		//Q4
		myWriter.write("Question 4\n\n" );
		
		//Test 4.1
		myWriter.write("Compilation Correct Test\n" );
		System.out.println("\n-----\nDid the Question4 compile correctly? y/n");
		answer = scan.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			score += 0.5; 
			myWriter.write("Compilation Correct Test Passed! (+0.5pt)\n" );
			
			//Test 4.2
			myWriter.write("Correct Output From File Test\n" );
			System.out.println("Visually examine Question4 and change path to test Output from File");
			System.out.println("Did the code pass the test? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 0.5; myWriter.write("Correct Output From File Test Passed! (+0.5pt)\n\n" );}
			else myWriter.write("Test 4.2 Failed...\n\n" );
			
		}
		
		else myWriter.write("Test 4.1, 4.2 Failed...\n\n" );
		
		
		
		//Q5
		myWriter.write("Question 5\n\n" );
		
		//Test 5.1
		myWriter.write("Compilation Correct Test\n" );
		System.out.println("\n-----\nDid the Question5 compile correctly? y/n");
		answer = scan.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			score += 1.0; 
			myWriter.write("Compilation Correct Test Passed! (+1.0pt)\n" );
			
			//Test 5.2
			myWriter.write("Correct Exception Test\n" );
			System.out.println("Visually examine Question5 and see if the NegativeArraySizeException is correctly implemented.");
			System.out.println("Did the code pass the test? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 1.0; myWriter.write("Correct Output From File Test Passed! (+1.0pt)\n\n" );}
			else myWriter.write("Test 5.2 Failed...\n\n" );
			
		}
		
		else myWriter.write("Test 5.1, 5.2 Failed...\n\n" );
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Q6
		myWriter.write("Question 6\n\n" );
		
		//Test 6.1
		myWriter.write("Compilation Correct Test\n" );
		System.out.println("\n-----\nDid the Question6 compile correctly? y/n");
		answer = scan.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			score += 1.0; 
			myWriter.write("Compilation Correct Test Passed! (+1.0pt)\n" );
			
			//Test 6.2
			myWriter.write("Correct UpperCase Modifications Test\n" );
			System.out.println("Visually examine Question6 and see if the letters are changed into UpperCase.");
			System.out.println("Did the code pass the test? y/n");
			answer = new String(scan.nextLine());
			if(answer.equals("y") || answer.equals("Y")) {score += 1.0; myWriter.write("Correct UpperCase Modifications Test Passed! (+1.0pt)\n\n" );}
			else myWriter.write("Test 6.2 Failed...\n\n" );
			
		}
		
		else myWriter.write("Test 6.1, 6.2 Failed...\n\n" );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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