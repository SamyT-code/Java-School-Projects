public class LinkedList2 {

    
    // Objects of type Node are linked together into linked lists.
    private static class Node {
        int value; // value of an item in the list.
        Node next; // Pointer to the next node in the list.
    }


    // Return a new list containing the same items as the list, but in the reverse order
    public static Node reverse( Node obj ) {
        Node reverse = null; // reverse will be the reversed list
        Node p = obj; // For traversing the list.

        while (p != null) { // Push the next node of list onto the front of reverse.
        // VOTRE CODE VIENT ICI
            Node r = reverse;

            reverse = new Node();
            reverse.value = p.value;
            reverse.next = r;
            p = p.next;
        }

        return reverse;
    }


    // Displays the items in the list to which the parameter, first, points. They are printed on one line, separated by spaces
    public static void display(Node first) {
    Node p; // For traversing the list.
        p = first;
        // VOTRE CODE VIENT ICI
        while(p != null){
            System.out.print(p.value + " ");
            p = p.next;
        }


    } 


    
    // Return the number of zeros that occur in a given linked list of int.
    public static int count( Node head ) {
    //  VOTRE CODE VIENT ICI
        int counter = 0;
        Node p = head;

        while(p != null){
            if(p.value == 0){
                counter++;
            }
            p = p.next;
        }

        return counter;
    } 

   
    // Return the number of zeros that occur in a given linked list of int. Uses recursion
    public static int countRecursive( Node head ) {
    // VOTRE CODE VIENT ICI
        int counter = 0;
        Node p = head;
        if(p == null){
            return 0;
        }
        if(p.value == 0){
            counter++;
        }
        return counter + countRecursive(head.next);

    } 


    /*** main program** */
    public static void main(String[] args) {

        Node list = null; // A list, initially empty.
        Node reverseList; // The reversed list.

        int count = 0; // The number of elements in the list

        while (true) {
        // add a new node onto the head of the list before repeating.
            count++;
            if (count == 10)
            break;
            Node head = new Node(); // A new node to add to the list.
            head.value = (int)(Math.random()*10); // A random value.
            head.next = list;
            list = head;
        }

        // Print the current list ; its reverse and the number of zeros in the list using both methods
        System.out.print("The list: ");
        display(list);
        System.out.println();
        reverseList = reverse(list);
        System.out.print("The reversed list: ");
        display(reverseList);
        System.out.println();
        System.out.println();
        System.out.print("The number of zeros in the list : ");
        System.out.println(count(list));
        System.out.print("The number of zeros in the list, using recursion : ");
        System.out.println(countRecursive(list));

    } // end of main()

} // end of LinkedList2 class