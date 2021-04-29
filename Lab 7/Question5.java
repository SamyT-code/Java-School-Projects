public class Question5{
    public static void main(String [] args){
        try{
            //VOTRE BLOC TRY VIENT ICI
            int[] tab = new int[-1];
        }
        catch(NegativeArraySizeException e){
            //VOTRE BLOC CATCH VIENT ICI
            System.out.println("generated exception : " + e);
        }
        
        System.out.println("After the try block"); //this code should still work
    }
}