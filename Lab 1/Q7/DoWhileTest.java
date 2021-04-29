public class DoWhileTest {
        
    public static void main(String[] args) {
        int num = 123489;
        int compteur = 0;
        int modulo;
        do{
            modulo = num%10;
            compteur = compteur + modulo;
            num = num/10;
        }
        while (num>0);
            
         System.out.println("La somme des chiffres qui constituent le nombre entier 123489 est: " + compteur);

    }
}