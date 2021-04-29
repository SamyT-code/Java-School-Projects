import java.io.*;

public class Question2 {
    public static void main( String [] args) {
        int tab[] = { 10,24,31,60,100 };
        System.out.println("enter a number as array index and find out its value");
        try {
            String line;
            int pos;
            BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
            while (( line = input.readLine()) != null) {
                if (line.equals("end"))
                    break;
                else {
                    try {
                        //VOTRE MORCEAU DE CODE VIENT ICI
                        pos = Integer.parseInt(line); //pour trouver l'index
                        System.out.println("Valid element and it is : "
                        + tab[pos]); //imprimer l'élément avec le bon index
                    }

                    //VOTRE 2ème MORCEAU DE CODE VIENT ICI
                    catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Invalid elements" );
                        System.out.println("Generated exception: " +e);
                    }

                    catch(NumberFormatException n){ //in case what is given is not a number
                        System.out.println("sorry no characters");
                        System.out.println("generated exception : " + n);
                    }

                }

            }

        }

        catch(IOException i){ 

        }

    }

}
