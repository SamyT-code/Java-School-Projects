public class USCode extends PostalCode{

    //private String code;

    public USCode(String code){
        this.code = code;
    }

    public boolean isValid(){
        String str = getCode();
        if(str.length() != 8){
            return false;
        }

        char c0 = str.charAt(0);
        char c1 = str.charAt(1);
        char c2 = str.charAt(2);
        char c3 = str.charAt(3);
        char c4 = str.charAt(4);
        char c5 = str.charAt(5);
        char c6 = str.charAt(6);
        char c7 = str.charAt(7);

        if( !(Character.isLetter(c0) && Character.isLetter(c1)) ) {
            return false;
        }

        if( !(Character.isDigit(c3) && Character.isDigit(c4) && Character.isDigit(c5)
        && Character.isDigit(c6) && Character.isDigit(c7)) ) {
            return false;
        }

        if(!Character.isWhitespace(c2)){
            return false;
        }

        return true;
    }

}