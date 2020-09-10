package com.company;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }


    public class Node {
        Object data;
        Node next;
        Node previous;

        public Node(Object data) {
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

        Node node1 = new Node("FIRST!");

        public boolean add(Object item) {
            Node node = new Node(item);
            this.setPrevious(tail);
            node = tail;
            return true;


        }

    }
}
