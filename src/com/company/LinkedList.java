package com.company;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean add(Object newEntry) {
        Node currentNode = head;
        Node newNode = new Node(newEntry);
        if (head == null) {
            System.out.println("Linked list is empty");
            head = newNode;
            System.out.println("Node Added");
        } else {
            System.out.println("Existing linked list found");
            while (currentNode.next != null) {
                System.out.println("checking current node is pointing to another node");
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            System.out.println("New Node Added");
        }
        return true;
    }

    public void count(Object newEntry, int index) {
        int counter = 0;
        Node currentNode = head;
        // System.out.println(head == null);
        if (head != null) {
            counter++;
            while (currentNode.next != null) {
                counter++;
                currentNode = currentNode.next;
            }
        }
        //System.out.println(counter);

        if (index>counter){
            System.out.println("The index is outside of the size of the Linked List!!!");
        }else{
            currentNode = head;
            Node newNode = new Node(newEntry);
            for(int i = 0; i<index-1; i++){
                currentNode = currentNode.next;
                currentNode.next = newNode;
            }
            System.out.println("New Node \"" + newEntry + "\" created at index " + index);
        }
    }

    public void addFirst(Object newEntry){
        Node newNode = new Node(newEntry);
            newNode.next = head;
            head = newNode;
        }

        public void addLast(Object newEntry){
            Node newNode = new Node(newEntry);
            Node currentNode = head;
            for(int i = 0; i<this.size()-1; i++){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode = tail;

        }

        public void clear(){
        head = null;
        tail = null;

        }

        public boolean contains(Object item) {
            Node currentNode = head;
            for (int i = 0; i < this.size(); i++) {
                if (currentNode.data == item) {
                    return true;
                } else {
                    currentNode = currentNode.next;
                }

            }
            return false;
        }

        public Object get(int index) {
            Node currentNode = head;
            if (index > this.size()) {
                return "The index is outside of the size of the Linked List!!!";
            } else {
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
                return currentNode.data;
            }
        }

        public Object getFirst(){
        if(head != null){
            return head;
        }else{
            return "There is no head in the linked list";
        }
        }


    public int size() {
        int counter = 0;
        Node currentNode = head;
        if (head != null) {
            counter++;
            while (currentNode.next != null) {
                counter++;
                currentNode = currentNode.next;
            }
        }
        return counter;
    }


    public void print(){
        Node currentNode = head;
        System.out.println(head.data);
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                System.out.println(currentNode.data);
            }
        }





    public class Node {
        Object data;
        Node next;
        Node previous;


        public Node(Object data){
            this.data = data;
            next = null;


    }






        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        //Node node1 = new Node("FIRST!");



    }
}
