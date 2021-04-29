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

        @SuppressWarnings ("unchecked")
        public static boolean algorithm2(String str ) {
            
            Stack<Character> myStack;
            myStack = new ArrayStack<Character>( 100 );

            for ( int i=0; i<str.length(); i++ ) {
                char current = str.charAt( i );
                if ( current == '(' || current == '[' || current == '{' ) {
                    myStack.push( new Character( current ) );
                }
                //votre code vient ici

                else if(current == ')'){
                    if(!myStack.isEmpty()){
                        while(myStack.peek() != '('){
                            myStack.pop();
                        }
                        myStack.pop();
                    }
                    else{
                        return false;
                    }
                }

                else if(current == ']'){
                    if(!myStack.isEmpty()){
                        while(myStack.peek() != '['){
                            myStack.pop();
                        }
                        myStack.pop();
                    }
                    else{
                        return false;
                    }
                }

                else if(current == '}'){
                    if(!myStack.isEmpty()){
                        while(myStack.peek() != '{'){
                            myStack.pop();
                        }
                        myStack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            if(algorithm1(str) == false){
                return false;
            }
            
            return myStack.isEmpty();
        }
       //votre code vient ici

    public static void main(String[] args) {

        System.out.println("algorithm2(\"([()]\") returns " + algorithm2("([)()]"));
        System.out.println("algorithm2(\"([][()])\") returns " + algorithm2("([][()])"));
        System.out.println("algorithm2(\"(14 * ((47 - 2))\") returns " + algorithm2("(14 * ((47 - 2))"));
        System.out.println();
        System.out.println("algorithm2(\"()[]()\") returns " + algorithm2("()[]()"));
        System.out.println("algorithm2(\"(14 * (47 - 2)))\") returns " + algorithm2("(14 * (47 - 2)))"));
        System.out.println("algorithm2(\"((())\") returns " + algorithm2("((())"));
        System.out.println("algorithm2(\"([)\") returns " + algorithm2("([)"));

    }

}