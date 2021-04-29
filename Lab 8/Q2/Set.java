public class Set{

    private static final String str = System.getProperty("line.seperator");

    private Cashier[] set;

    public Set(int nbr){
        if(nbr<1){
            throw new IllegalArgumentException("L'argument nbr est plus petit que 1");
        }
        set = new Cashier[nbr];
        for (int i = 0; i < set.length; i++) {
            set[i] = new Cashier();
        }
    }
            
    public void add(Client client){
        int ind = 0;
        int min = set[0].getQueueSize();

        for (int i = 0; i < set.length; i++) {
            if(min > set[i].getQueueSize()){
                ind = i;
                min = set[i].getQueueSize();
            }
        }
        set[ind].add(client);
    }

    public void servedClients(int currentTime){
        for (int i = 0; i < set.length; i++) {
            set[i].servedClients(currentTime);
        }
    }

    public String toString(){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < set.length; i++) {
            s.append("LINE " + i +"\n");
            s.append(set[i]);
            s.append("\n");
        }

        return s.toString();
        
    }

}

