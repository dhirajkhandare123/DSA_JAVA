public class SinglyLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void inserAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            tail = newNode;
            head = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtPosition(int position, int data){
        if(position < 1 || position > size + 1){
            System.out.println("Insertion is not possible");
            return;
        } else if (position == 1) {
            insertAtHead(data);
            return;

        } else if(position == size + 1) {
            inserAtTail(data);
            return;
        }
        // to insert at middle
        Node prevNode = new Node(data);
        for(int i=1;i<=position-2;i++){
            prevNode = prevNode.next;
        }

        Node newNode = new Node(data);
        // update links
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;
    }

    static void main(String[] args) {

    }
}
