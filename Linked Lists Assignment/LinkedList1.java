public class LinkedList1 {


    // The nested class Node
    private static class Node {
        String value;
        Node next;
    }

    // Instance variable
    private Node head = null; // A pointer to the first node in the linked list. If the list is empty, the value is null.

    
    /**
     * Searches the list for a specified item.
     * @param obj the item that is to be searched for
     * @return true if obj is one of the items in the list or false if not
     */
    public boolean find(String obj) {
        Node p; // A pointer for traversing the list.
        p = head; // Start by looking at the head of the list.

        // VOTRE CODE VIENT ICI
        while(p != null){
            if(p.value.equals(obj)){
                return true;
            }
            p = p.next;
        }
        return false;
    } 


    
    // Remove a specified item (obj) from the list, if that item is present.
    public boolean remove(String obj) {
        if ( head == null ) { // The list is empty.
        //VOTRE PREMIER MORCEAU DU CODE VIENT ICI
            return false;
        }

        else if ( head.value.equals(obj) ) { // obj is the first item of the list.
        // VOTRE DEUXIÈME MORCEAU DU VIENT ICI
            //head = null;
            head = head.next;
            return true;
        }

        else {
            // VOTRE TROISIÈME MORCEAU DU VIENT ICI
            Node p = head;
            if(p.next == null){
                return false;
            }

            
            while(p.next != null){
                
                if(p.next.value.equals(obj)){
                    p.next = p.next.next;
                    return true;
                }
                p = p.next;

                
            }
                     
                return false;
            
            }

        }


    // Add a specified item (obj ) to the list, keeping the list in order.
    public void add(String obj) {
        Node newNode = new Node(); // A Node to contain the new item.
        newNode.value = obj; // newNode.next is null.

        if ( head == null ) { // The new item is the first (and only) one in the list.
            // VOTRE PREMIER MORCEAU DU CODE VIENT ICI
            head = newNode;
            System.out.println("Yeah, there's a problem here");

        }

        else if ( head.value.compareTo(obj) >= 0 ) { // The new item is less than the first item in the list,so it has to be inserted at the head of the list.
            // VOTRE DEUXIÈME MORCEAU DU VIENT ICI
            newNode.next = head;
            head = newNode;

        }

        else {
            //VOTRE TROISIÈME MORCEAU DU VIENT ICI
            Node p = head;
            int count = 0;
            while(p.next != null){
                if(p.value.compareTo(obj) >= 0){
                    Node after = p.next;
                    p.next = newNode;
                    newNode.next = after;
                    break;
                }
                p = p.next;
                count++;
                if(count > 10){
                    System.out.println("Yeah, there's a problem");
                    break;
                }
            }
            p.next = newNode; 

        }
    } 

    
    // Returns an array that contains all the elements in the list.
    // If the list is empty, the return value is an array of length zero.
    public String[] getList() {
        int count = 0; // For counting elements in the list.
        Node p = head; // For traversing the list.
        String[] elements; // An array to hold the list elements.
        
        while (p != null) { // First, go through the list and count the number of elements that it contains.
        // VOTRE PREMIER MORCEAU DU CODE VIENT ICI
            p = p.next;
            count++;

        }

        // Create an array just large enough to hold all the list elements. Go through the list again and fill the array with elements from the list.
        // VOTRE DEUXIÈME MORCEAU DU VIENT ICI

        

        elements = new String[count];
        p = head;
        for(int i = 0; i < elements.length; i++){
            elements[i]= p.value;
            p = p.next;
        }
        return elements;

    } 
} 