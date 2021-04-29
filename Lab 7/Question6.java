import java.io.*;

public class Question6 {
    public static void main(String [] args) {
        try {
            // Création du flot de lecture par octet
            InputStream is = new FileInputStream("C:/Users/samyt/Desktop/java junk 2/lab7/write.txt"); //changer code
            // Création du flot de lecture par caractères
            //VOTRE MORCEAU DE CODE VIENT ICI

            int count;

            while((count = is.read()) != -1){
                char c = (char)count;
                System.out.print(Character.toUpperCase(c));
            }
        }
        catch(IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}