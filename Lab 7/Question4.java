import java.io.*;

public class Question4{
    public static void main(String [] args) throws IOException, FileNotFoundException {
        InputStreamReader input = null;
        try {
            input = new InputStreamReader( new FileInputStream("data.txt"));
            //ou: input = new InputStreamReader ("C:/YOUR PATH/write.txt");
            int c;

            while ( ( c = input.read() ) != -1 ) {
                System.out.write( c );
            }

        }
        catch(FileNotFoundException e){
            System.out.println("exception generated : FileNotFoundException");
        }
        //VOTRE MORCEAU DE CODE VIENT ICI
        finally {
        if ( input != null )
        input.close();
        System.out.println();
        System.out.println("Inside finally");
        }
    }
}