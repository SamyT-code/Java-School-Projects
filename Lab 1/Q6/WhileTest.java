public class WhileTest {
        
    public static void main(String[] args) {
        int num = 123489;
        int compteur = 0;
        int modulo;
        while (num>0){
            modulo = num%10;
            compteur = compteur + modulo;
            num = num/10;
        }
         System.out.println("La somme des chiffres qui constituent le nombre entier 123489 est: " + compteur);

    }
}