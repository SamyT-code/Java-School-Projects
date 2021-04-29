import java.io.InputStreamReader;
import java.io.IOException;

public class Question1 {
    public static void main( String[] args ) throws IOException {

    System.out.println("Enter some characters and a return:");
    InputStreamReader in = new InputStreamReader( System.in );
    char[] tampon = new char[256];
    in.read(tampon);
    String s = new String(tampon);
    
    System.out.println("\n"+"The number of characters read is: "
    + s.trim().length());
    //int num;
    //while ( ( num = in.read() ) != -1 ) {
      //  char c = (char) num;
        //System.out.println( "unicode = " + num + ", char = " + c );
    //}

    System.out.println("\n"+ "bye" );

    }
    
} 
//PS C:\Users\samyt\Desktop\java junk 2\lab7\tishamlab7\Lab7_300189261>