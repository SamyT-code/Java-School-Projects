public class Test{

    public static boolean algorithm1 ( String str ) {
        int brace , square , bow ;
        brace = square = bow = 0 ;
        for ( int i =0; i<str.length ( ) ; i++) {
            char c ;
            c = str.charAt ( i ) ;
            switch ( c ) {
                case '{' :
                    brace ++;
                    break ;
                case '}' :
                    brace --;
                    break ;
                case '[' :
                    square++;
                    break ;
                case ']' :
                    square--;
                    break ;
                case '(' :
                    bow ++;
                    break ;
                case ')' :
                    bow --;
            }
        }

        return brace == 0 && square == 0 && bow == 0 ;
       }
       

    public static void main(String[] args) {

        System.out.println("algorithm1(\"()[]()(\") returns " + algorithm1("()[]()("));
        System.out.println("algorithm1(\"([][()])\") returns " + algorithm1("([][()])"));
        System.out.println("algorithm1(\"(14 * (47 - 2))\") returns " + algorithm1("(14 * (47 - 2))"));
        
    }

}