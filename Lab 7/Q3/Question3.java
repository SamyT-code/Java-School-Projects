import java.io.*;

public class Question3 {

    public static byte getInput()[] throws Exception{
        //VOTRE MORCEAU DE CODE VIENT ICI
        return new byte[50];
    }
    public static void main(String args[])throws Exception {
        byte input[] = getInput();
        OutputStream myOutFile = new FileOutputStream("C:/Users/samyt/Desktop/java junk 2/lab7/write.txt"); //code ici

        for(int i=0; i<50; i++){
            myOutFile.write(input [i]);
        }

        myOutFile.close();
        int size;
        InputStream myInFile = new FileInputStream ("C:/Users/samyt/Desktop/java junk 2/lab7/write.txt"); //code ici
        size = myInFile.available();
        System.out.println("reading contents of file write2.txt…");

        for(int i=0; i<size; i++) {
        System.out.print((char)myInFile.read());
        }

        myInFile.close();
    }

}
    