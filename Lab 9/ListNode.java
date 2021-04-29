public class ListNode implements InterfaceNode {
    // Implementation of the doubly linked nodes (nested-class)
    private static class Node {
        private Comparable value;
        private Node prev; //précédent
        private Node next; //suivant
        
        private Node ( Comparable value, Node prev, Node next ) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    // Instance variables
    private Node head;
    
    // Constructor: Empty list.
    public ListNode() {
        // a dummy node is created 
        head = new Node(null, null,null);
        head.next = head;
        head.prev = head;
    }

    // Instance methods
    public int size() {

        int counter = 0; 
        Node n = this.head.next;
        
        
        
        while (head != n) { //parcourir le node
            n = n.next;
            counter++;
        }

        return counter;
    }
    
    public Object get( int pos ) {
        Node n = this.head.next;
        if(pos > this.size() || pos < 0) //check pour voir si "l'index" est valide
            throw new IndexOutOfBoundsException("le pos est trop gros ou trop petit");
        
        for(int i = 0; i < pos; i++) {
            n = n.next; //parcourir le listnode
        }

        return n.value;
    }
    
    public boolean add( Comparable obj) {
        if(obj == null) {
            throw new IllegalArgumentException("obj ne peut être null");
        } 

        if (this.head == this.head.next) {
            Node n = new Node(obj, head, head);
            this.head.prev = n;
            this.head.next = n;
            return true;
        } 
        Node n = head;

        n = n.next;
        while (n != head) {
            n = n.next;

            if (n.next == head || obj.compareTo(n.next.value) <= 0) {
                n.next.prev = n.next = new Node(obj, n, n.next);
                return true;
            }
        } 
        
        return false; // devrait toujours true a cause du loop en haut
    }
    
    public void remove( int pos ) {
        
        if (pos > this.size() || pos < 0) {
            throw new IndexOutOfBoundsException("on ne peut ajouter à cette position " + pos);
        }

        Node n = head.next;

        int counter = 0;
        while(counter < pos){ //I'm fancy so I don't use for loops
            n=n.next;
            counter++;
        }

        //créer 2 nodes
        Node avant = n.prev;
        Node apres = n.next;

        avant.next = apres;
        apres.prev = avant;
    }

    //Both lists store their elements in increasing order, so both lists can be traversed simultaneously.
    public void merge( ListNode other ) {
        Node node = head.next;
        Node nodeNext= other.head.next;

        while(nodeNext!=other.head){

            if ( node == head ) {
                //À COMPLÉTER
                Node n = new Node(nodeNext.value, this.head.prev, this.head);
                this.head.prev.next = this.head.prev = n;
            }

            else if (nodeNext.value.compareTo(node.value) < 0){
                //insert before
                //À COMPLÉTER
                Node n = new Node(nodeNext.value, node.prev, node);
                node.prev.next = node.prev = n;
                nodeNext = nodeNext.next;
            }

            else if (node.next==head){
                //insert after
                //À COMPLÉTER
                Node n = new Node(nodeNext.value, node, this.head);
                node.next = this.head.prev = n;
                nodeNext = nodeNext.next;
            }

            else {
                //À COMPLÉTER
                node = node.next;
            }
        }
    }
   
} 

// public class ListNode implements InterfaceNode {

//     // Implementation of the doubly linked nodes (nested-class)
//     private static class Node {
//         private Comparable value; // -1 0 ou 1
//         private Node prev; //précédent
//         private Node next; //suivant

//         private Node ( Comparable value, Node prev, Node next ) {
//             this.value = value;
//             this.prev = prev;
//             this.next = next;
//         }

//     }

//     // Instance variables
//     private Node head;

//     // Constructor: Empty list.
//     public ListNode() {
//         // a dummy node is created
//         head = new Node(null, null,null);
//         head.next = head;
//         head.prev = head;
//     }

//     // Instance methods
//     public int size() {
//         //throw new UnsupportedOperationException( "error!" );
  
//         int counter = 0; 
//         Node n = head.next;
//         while (head != n) {   
//             n = n.next;
//             counter = counter + 1;

//         }

//         return counter;
//     }

//     public boolean add( Comparable obj ) {
//         //throw new UnsupportedOperationException( "error!" );
//         if(obj == null){
//             throw new IllegalArgumentException("argument illégal");
//         }
        
//         if(head == head.next){
//             Node n = new Node(obj, head, head);
//             head.prev = n;
//             head.next = n;
//             return true;
//         }

//         Node n = this.head;

//         while(n != head){
//             if(obj.compareTo(n.next.value) < 1 || n.next == head){
//                 Node m = new Node(obj, n, n.next);
//                 n.next = m;
//                 n.next.prev = m;
//                 return true;
//             } else{
//                 n = n.next;
//             }
//         }

//         return false;

//     }

//     public Object get( int pos ) {
//         //throw new UnsupportedOperationException( "error!" );
//         Node n = this.head.next;
//         if(this.size() < pos || pos < 0){
//             throw new IndexOutOfBoundsException("index out of bounds");
//         }

//         for(int i = 0; i < pos; i++){
//             n = n.next;
//         }

//         if(n.value==null){
//             //throw new NullPointerException("value is null");
//             return 1;
//         }

//         return n.value;
//     }

//     public void remove( int pos ) {
//         //throw new UnsupportedOperationException( "error!" );

//         // if(pos > this.size() || pos < 0)
//         //     throw new IndexOutOfBoundsException("pos out of bounds");

//         // //Node n = this.head.next;
//         // Node n = head.next;

//         // for(int i=0; i < pos; i++){
//         //     n = n.next;
//         // }

//         // Node before = n.prev;
//         // Node after = n.next;

//         // before.next = after;
//         // after.prev = before;

//         Node p = head.next;
//         if (pos < 0 || pos > this.size()) {
//             throw new IndexOutOfBoundsException("Valeur de pos n'est pas valide; pos = " + pos + ", size = " + this.size());
//         }

//         //parcourir la liste jusqu'à l'élément désirée
//         for (int i = 0; i < pos; i++) {
//             p = p.next;    
//         }

//         //changer les références à p dans les éléments adjacents 
//         Node o = p.prev;
//         Node q = p.next;
//         o.next = q;
//         q.prev = o;
        

//     }
//     public void merge( ListNode other ) {
//         Node node = head.next;
//         Node nodeNext = other.head.next;
//         while (nodeNext != other.head) {
//             if( node == head ) {
//                 // À COMPLETER
//                 Node n = new Node(nodeNext.value, head.prev, head);
//        

//             } else if (nodeNext.value.compareTo(node.value) < 0) {
//                 //insert before
//                 // À COMPLETER
//           

//             } else if (node.next == head) {
//                 //insert after
//                 // À COMPLETER

//     
//             } else {
//                 //À COMPLÉTER
//             }
//         }
//     }

//     public static void main(String[] args) {
        
//     }

// } // ferme la classe ListNode.java.
   