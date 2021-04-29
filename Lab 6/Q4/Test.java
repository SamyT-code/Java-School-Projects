public class Test{

    public static void main(String[] args) {
        PostalCode[] codes = new PostalCode[100];
        int n = 10;
        for(int i = 0; i < n; i++){
            codes[0] = new CanadaCode("K20 0A7");
            codes[1] = new CanadaCode("K2W 0A7"); //valide
            codes[2] = new CanadaCode("K20  0A7");
            codes[3] = new CanadaCode("K2w0A7");
            codes[4] = new CanadaCode("k2w 0A7"); //valide
            codes[5] = new CanadaCode("K20 0A7 ");
            codes[6] = new CanadaCode("K2W 007");
            codes[7] = new USCode("ab 12345"); //valide
            codes[8] = new USCode("ab'1234");
            codes[9] = new USCode("K20 0A7");
        }

        int counter = 0;
        for(int i = 0; i < n; i++){
            if (codes[i].isValid()){
                counter++;
            }
        }

        System.out.println(String.valueOf(counter) + " code(s) sont valides");
    }

}