public class CanadaCode extends PostalCode{

    //private String code;

    public CanadaCode(String code){
        this.code = code;
    }

    public boolean isValid(){
        String str = getCode();
        if(str.length() != 7){
            return false;
        }

        char c0 = str.charAt(0);
        char c1 = str.charAt(1);
        char c2 = str.charAt(2);
        char c3 = str.charAt(3);
        char c4 = str.charAt(4);
        char c5 = str.charAt(5);
        char c6 = str.charAt(6);

        if( !(Character.isDigit(c1) && Character.isDigit(c4) && Character.isDigit(c6)) ) {
            return false;
        }

        if( !(Character.isLetter(c0) && Character.isLetter(c2) && Character.isLetter(c5)) ) {
            return false;
        }

        if(!Character.isWhitespace(c3)){
            return false;
        }
        return true;
    }


}