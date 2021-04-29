public class Client{

    private static final int MAX_ITEMS = 25;

    private int arriveTime;
    private int Items;
    private int initialItems;

    public Client(int arriveTime){
        this.arriveTime = arriveTime;
        Items = (int) ( (MAX_ITEMS-1)*Math.random() ) +1;
        initialItems = Items;
    }

    public int getArriveTime(){
        return this.arriveTime;
    }

    public int getItems(){
        return this.Items;
    }

    public int getItemsDone(){
        return this.initialItems - this.Items; //not sure about this
    }

    public void serve(){
        //if(this.Items>0){
        this.Items--;
       // }
        //else{
        //    System.out.println("This person no longer needs to be served");
       // }
    }
/*
    public static void main(String[] args) {
        Client c = new Client(22);
        System.out.println("arrive time: "+c.getArriveTime());
        System.out.println("initial items: "+c.getItems());
        System.out.println("done before serving: "+c.getItemsDone());
        c.serve();
        System.out.println("done after serving: "+c.getItemsDone());
        int counter = 0;
        while(counter<c.initialItems+10){
            c.serve();
            System.out.println("done after serving: "+c.getItemsDone());
            counter++;
        }
    }
*/

}