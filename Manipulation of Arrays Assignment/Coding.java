public class Coding{

	public static byte[][] code(byte[] data) {
		int rows = 3;
		int columns = data.length;
		byte[][] tableau = new byte[rows][columns];

		for(int i = 0; i<rows; i++){
		    for(int j = 0; j<columns; j++){
		        tableau[i][j] = data[j];
		    }
		}

		return tableau;
	}

	// /*
	public static byte[] decode(byte[][] data){
		
      	byte[] clean = new byte[data[0].length];
      	byte[] column = new byte[data.length];

      	for(int i = 0; i < clean.length; i++){
      		for(int j = 0; j < column.length; j++){
      		column[j] = data[j][i];
      		}
      		clean[i] = mostRecurring(column);
      	}

      	return clean;
	}// */

	//Le code pour cette fonction a ete pris de StackOverflow
	// https://stackoverflow.com/questions/8545590/find-the-most-popular-element-in-int-array
	public static byte mostRecurring(byte[] a){
	  byte count = 1, tempCount;
	  byte popular = a[0];
	  byte temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = a[i];
	    tempCount = 0;
	    for (int j = 1; j < a.length; j++)
	    {
	      if (temp == a[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  return popular;
	}

	public static void main(String[] args){
      byte[] array = {1,2,4,11,26,15}; 
      byte[][] tab = code(array);

      for(int i = 0; i < tab.length; i++){
      	for(int j = 0; j < tab[i].length; j++){
      		System.out.print(tab[i][j]);
      		System.out.print(" ");
      	}
      	System.out.println();
      }
      System.out.println();

      for(int i = 0; i < tab[0].length; i++){
      	for(int j = 0; j < tab.length; j++){
      		System.out.print(tab[j][i] + " ");
      	}
      }
      System.out.println(); System.out.println();
      
      //Changing the values of the array
      tab[0][3] = 14;
      tab[1][1] = 3;
      tab[2][3] = 14;

      System.out.println("Nouveau tableau imparfait: ");
      
      //re-printing the 2D array
      for(int i = 0; i < tab.length; i++){
      	for(int j = 0; j < tab[i].length; j++){
      		System.out.print(tab[i][j]);
      		System.out.print(" ");
      	}
      	System.out.println();
      }

      byte[] column = new byte[3];
      for(int i = 0; i < 3; i++){
      	column[i] = tab[i][2];
      } 

      /*for(int i = 0; i < 3; i++){
      	System.out.println(column[i]);
      }*/
      System.out.println();

      byte[] last = decode(tab);

      System.out.println("Correction du tableau imparfait: ");

      for(int i = 0; i < last.length; i++){
      	System.out.print(last[i] + " ");
      }
      System.out.println();

    }
}