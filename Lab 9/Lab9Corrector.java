import java.util.*; // Import for ArrayList, Stack and PriorityQueue
import java.io.*;   // Import for Scanner, File and FileWriter
import java.util.Arrays;

public class Lab9Corrector{



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
		myWriter.write("Correction du Lab #9\n");
		myWriter.write("AE: Benoit Vanasse\n");
		myWriter.write("Courriel: bvana069@uottawa.ca\n");
		myWriter.write("Note: Pour toutes questions, veuillez ME contacter via MS Teams et non le professeur.\n");
		myWriter.write(System.getProperty( "line.separator" ));
		

		myWriter.write("Compilation Correct Test\n" );
		System.out.println("Did ListNode.java compile correctly? y/n");
		String answer = scan.nextLine();
		
		if(answer.equals("y") || answer.equals("Y")) { 
			myWriter.write("Compilation Correct Test Passed! \n\n" );
			
			//Create the ListNode
			ListNode node = new ListNode();
			
			//Test 1 - Empty List on Creation
			myWriter.write("Test 1 - Empty List on Creation\n" );
			if(node.size() == 0) {
				score += 1; 
				myWriter.write("Test 1 Passed! (+1pt)\n\n" );}
			else myWriter.write("Test 1 Failed...\n\n" );
			
			//Test 2 - Correct Size Output
			node.add(1);
			myWriter.write("Test 2 - Correct Size Output\n" );
			if(node.size() == 1) {
				score += 1; 
				myWriter.write("Test 2 Passed! (+1pt)\n\n" );}
			else myWriter.write("Test 2 Failed...\n\n" );
			
			//Test 3 - Add Nodes
			node.add(0);
			node.add(2);
			node.add(4);
			node.add(3);
			myWriter.write("Test 3 - Add Nodes\n" );
			if(node.size() == 5) {
				score += 1; 
				myWriter.write("Test 3 Passed! (+1pt)\n\n" );}
			else myWriter.write("Test 3 Failed...\n\n" );
			
			//Test 4 - Check Sort and get(int pos)
			myWriter.write("Test 4 - Check Sort and get(int pos)\n" );
			if( (int) node.get(0) == 0 &&  (int) node.get(4) == 4) {
				score += 1; 
				myWriter.write("Test 4 Passed! (+1pt)\n\n" );}
			else myWriter.write("Test 4 Failed...\n\n" );
			
			//Test 5 - Check IllegalArgumentException Thrown
			myWriter.write("Test 5 - Check IllegalArgumentException Thrown\n" );
			try{
				node.add(null);
				myWriter.write("Test 5 Failed...\n\n" );
				}
			catch(IllegalArgumentException e){
				score += 1; 
				myWriter.write("Test 5 Passed! (+1pt)\n\n" );
			}
			
			//Test 6 - Check IndexOutOfBoundsException Thrown in get()
			myWriter.write("Test 6 - Check IndexOutOfBoundsException Thrown in get()\n" );
			try{
				node.get(-1);
				myWriter.write("Test 6 Failed...\n\n" );
				}
			catch(IndexOutOfBoundsException e){
				score += 1; 
				myWriter.write("Test 6 Passed! (+1pt)\n\n" );
			}
			
			//Test 7 - Check remove(int pos)
			myWriter.write("Test 7 - Check remove(int pos)\n" );
			node.remove(0);
			if( (int) node.get(0) == 1 && node.size() == 4) {
				score += 1; 
				myWriter.write("Test 7 Passed! (+1pt)\n\n" );}
			else myWriter.write("Test 7 Failed...\n\n" );
			
			//Test 8 - Check IndexOutOfBoundsException Thrown in remove()
			myWriter.write("Test 8 - Check IndexOutOfBoundsException Thrown in remove()\n" );
			try{
				node.remove(-1);
				myWriter.write("Test 8 Failed...\n\n" );
				}
			catch(IndexOutOfBoundsException e){
				score += 1; 
				myWriter.write("Test 8 Passed! (+1pt)\n\n" );
			}
			
			ListNode node2 = new ListNode();
			node2.add(0);
			node2.add(5);
			
			//Test 9 - Add() in Merge()
			myWriter.write("Test 9 - Add() in Merge()\n" );
			System.out.println("Did the student use add() in merge()? y/n");
			answer = scan.nextLine();
		
			if(answer.equals("n") || answer.equals("N")) { 
				score += 1; 
				myWriter.write("Test 9 Passed! (+1pt)\n\n" );
			} else{myWriter.write("Test 9 Failed...\n\n" );}
			
			//Test 10.1 - Merge node2 into node
			myWriter.write("Test 10.1 - Merge node2 into node\n" );
			node.merge(node2);
			if(node.size() == 6 &&  (int) node.get(0) == 0 &&  (int) node.get(5) == 5){
				score += 0.5; 
				myWriter.write("Test 10.1 Passed! (+0.5pt)\n\n" );
			}
			else{myWriter.write("Test 10.1 Failed...\n\n" );}
			
			//Test 10.2 - Node2 unchanged after merge()
			myWriter.write("Test 10.2 - Node2 unchanged after merge()\n" );
			if(node2.size() == 2 &&  (int) node2.get(0) == 0 &&  (int) node2.get(1) == 5){
				score += 0.5; 
				myWriter.write("Test 10.2 Passed! (+0.5pt)\n\n" );
			}
			else{myWriter.write("Test 10.2 Failed...\n\n" );}
			
			
				
			
			
		
		
		}
		
		else {
			myWriter.write("Your ListNode.java did not compile correctly.\n" );
			myWriter.write("Contact Benoit directly for resubmission.\n" );
			}
		

		
		//myWriter.write(System.getProperty( "line.separator" ));
		myWriter.write(System.getProperty( "line.separator" ));
	
		//Final
		score = round(score,1);
		myWriter.write("Votre result finale est: " + score);
		myWriter.write(System.getProperty( "line.separator" ));
		
		if(score < 10){
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