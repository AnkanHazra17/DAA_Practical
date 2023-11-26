


public class LinkListLL{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);  
        size++;   

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;  
        head = newNode;  
    }

    public void addLast(int data){
        Node newNode = new Node(data);  
        size++;   

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode; 
        tail = newNode;  
    }

    public int removeFirst(){
        if(size == 0){
            return Integer.MIN_VALUE;  
        }
        else if(size == 1){    
            int val = head.data;  
            head = tail = null;
            size = 0;   

            return val;  
        }

        int val = head.data;   
        head = head.next;
        size--;  
        return val;  
    }

    public int removeLast(){

        if(size == 0){
            return Integer.MIN_VALUE;  
        }

        else if(size == 1){
            int val = head.data;  
            head = tail = null;
            size = 0;  
            return val; 
        }

        Node prev = head;

        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val; 
    }

    public void printList(){
        Node temp = head;  

        while(temp != null){  
            System.out.print(temp.data + " -> "); 
            temp = temp.next; 
        }
        System.out.println("null"); 
    }



    public static void main(String[] args) {
        LinkListLL list = new LinkListLL();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(8);
        System.out.println("Printing the linked list:");
        list.printList();

        System.out.println("Removing elements");
        System.out.println(list.removeFirst() + " is removed from the linked list");
        System.out.println(list.removeFirst() + " is removed from the linked list");
        System.out.println(list.removeFirst() + " is removed from the linked list");
        
        System.out.println(list.removeLast() + " is removed from the linked list");
        System.out.println(list.removeLast() + " is removed from the linked list");
        System.out.println(list.removeLast() + " is removed from the linked list");

        System.out.println("Printing the linked list after removing elements");
        list.printList();
    }
}

