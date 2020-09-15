package com.company;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(Object newEntry) {
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
    }


    private class Node {
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
