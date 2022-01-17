package LinkedListImpl;

import linkedList.Node;

public class LinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next = null;
        }
    }
    Node head = null;
    public void insertionAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertionAtTheEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp;
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insertionAfterANode(Node prevNode,int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.data != prevNode.data){
                if(temp.next == null) {
                    System.out.println("NODE NOT FOUND!!");
                    return;
                }
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }

        }
        public void deletionAtBeginning(){
            if(head == null){
                System.out.println("List is empty!! Deletion not possible");
            }
            else{
                Node temp = head;
                if(temp.next == null){
                    head = null;
                }
                else{
                    head = temp.next;
                }
            }
        }
        public void deletionAtEnd(){
            if(head == null){
                System.out.println("List is empty!! DELETION not possible");
            }
            else{
                Node temp1,temp2;
                temp1 = head;
                temp2 = null;
                if(temp1.next == null){
                    head = null;
                    return;
                }
                else{
                    while(temp1.next != null){
                        temp2 = temp1;
                        temp1 = temp1.next;
                    }
                    temp2.next = null;
                }
            }
        }
        public void insertionAtASpecifiedPosition(int position,int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            if(position == 0){
                newNode.next = head;
                head = newNode;
            }
            else{
                Node temp = head;
                for(int i = 0; temp != null && i<position-1;i++){
                    temp = temp.next; //temp = null;
                }
                if (temp == null || temp.next == null){
                    System.out.println("cannot insert");
                    return;}
                newNode.next = temp.next;
                temp.next = newNode;
            }

        }
        public void deletionAtSpecifiedLocation(int position) {
            if (head == null)
            {
                return;
            }
            Node temp = head;
            if (position == 0) {
                head = temp.next;
                return;
            }
            // Find the key to be deleted
            for (int i = 0; temp != null && i < position - 1; i++){
                temp = temp.next;
            }

            // If the key is not present
            if (temp == null)
                return;

            // Remove the node
            Node next = temp.next.next;
            temp.next = next;
            }


        public void display(){
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionAtBeginning(1);
        list.display();
        list.insertionAtTheEnd(2);
        list.display();
        list.insertionAtBeginning(0);
        list.display();
        list.insertionAfterANode(list.head.next,100);
        list.display();
        list.deletionAtBeginning();
        list.display();
        list.deletionAtEnd();
        list.display();
        list.insertionAtASpecifiedPosition(0,20);
        list.display();
        list.insertionAtASpecifiedPosition(200,200);
        list.display();
//        list.insertionAtASpecifiedPosition(200,2000);
//        list.display();
//        list.insertionAtASpecifiedPosition(2,2222);
//        list.display();
//        list.deletionAtSpecifiedLocation(20);
//        list.display();
    }
    }

