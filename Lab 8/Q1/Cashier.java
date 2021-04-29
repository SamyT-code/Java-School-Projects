public class Cashier{

    private static final String str = System.getProperty("line.separator" );

    private Queue<Client> queue;
    private Client currentClient;
    private int ClientTime;
    private int ClientsServed;
    private int ItemsDone;

    public Cashier(){
        this.queue = new ArrayQueue<Client>(); 
        this.currentClient = null;
        this.ClientTime = 0;
        this.ClientsServed = 0;
        this.ItemsDone = 0;
    }

    public void add(Client client){
        this.queue.enqueue(client);
    }

    public int getQueueSize(){
        return this.queue.size();
    }

    public void servedClients(int currentTime){ //come back to this later
        if(this.currentClient == null){
            if(this.queue.isEmpty() == false){
                this.currentClient = this.queue.dequeue();
                //this.ClientTime += currentTime - this.currentClient.getArriveTime();
                this.ClientTime += (currentTime - this.currentClient.getArriveTime());
                //System.out.println("client time: " + this.ClientTime);
                //System.out.println("current time: " + currentTime);
                //System.out.println("arrival time: " + this.currentClient.getArriveTime());
            
            }
        }

        if(this.currentClient != null){
            if(this.currentClient.getItems() != 0){
                this.currentClient.serve();
            }
            else{
                this.ItemsDone += this.currentClient.getItemsDone();
                this.ClientsServed++;
                this.currentClient = null;
            }
        }

    }

    public int getClientTime(){
        return this.ClientTime;
    }

    public int getItemsDone(){
        return this.ItemsDone;
    }

    public int getClientsServed(){
        return this.ClientsServed;
    }

    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append( "The total number of clients served is " );
        out.append( ClientsServed );
        out.append( str );
       
        out.append( "The average number of items per client was " );
        //…À COMPLETER ICI
        out.append( this.ItemsDone / this.ClientsServed + "\n" );

        out.append( "The average time (in seconds) was " );
        //…À COMPLETER ICI
        out.append( this.ClientTime / this.ClientsServed + "\n" );

        return out.toString();

        }
       

    public static void main(String[] args) {
        Cashier a = new Cashier();
        a.add(new Client(1));
        a.servedClients(1);

        System.out.println(a);
    }

}