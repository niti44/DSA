package LinkedList1;

public class LinkedList {
    Node head =null;
    //INSERTION OPERATION
    void insertionAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode .next =head;
            head = newNode;
        }
    }

    void insertionAtTheEnd(int data){
        Node newNode = new Node(data);
        //if the linked list is empty
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
//        newNode.next =  null;
    }

    void display(){
        if(head == null){
            System.out.println("The linked list is empty..cannot print values");
            return;
        }
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void deletionFromTheBeginning(){
        if(head == null){
            System.out.println("The linked list is empty..cannot delete");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deletionFromTheEnd(){
        if(head == null){
            System.out.println("The linked list is empty..cannot delete");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insertionAtBeginning(2);
        linkedList.insertionAtBeginning(1);
        linkedList.insertionAtBeginning(0);
        linkedList.insertionAtTheEnd(3);
//        linkedList.display();
        linkedList.insertionAtTheEnd(4);
//        linkedList.display();
        linkedList.deletionFromTheBeginning();
//        linkedList.display();
        linkedList.deletionFromTheBeginning();
        linkedList.display();
        linkedList.deletionFromTheEnd();
        linkedList.display();
        linkedList.deletionFromTheEnd();
        linkedList.display();
    }
}
