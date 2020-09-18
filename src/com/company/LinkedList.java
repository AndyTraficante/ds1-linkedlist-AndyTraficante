package com.company;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean add(Object newEntry) {
        //if (!this.isHeadNull()) {
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
        return true; /*
        } else {
            System.out.println("Head is null!");
        }
        return false;
    }
    */
    }

    public void add(Object newEntry, int index) {
        if (!this.isHeadNull()) {
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

            if (index > counter) {
                System.out.println("The index is outside of the size of the Linked List!!!");
            } else {
                currentNode = head;
                Node newNode = new Node(newEntry);
                for (int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.next;
                    currentNode.next = newNode;
                }
                System.out.println("New Node \"" + newEntry + "\" created at index " + index);
            }
        } else {
            System.out.println("Head is null!");
        }
    }

    public void addFirst(Object newEntry) {
        if (!this.isHeadNull()) {
            Node newNode = new Node(newEntry);
            newNode.next = head;
            head = newNode;
        } else {
            System.out.println("Head is null!");
        }
    }

        public void addLast(Object newEntry) {
            if (!this.isHeadNull()) {
                Node newNode = new Node(newEntry);
                Node currentNode = head;
                for (int i = 0; i < this.size() - 1; i++) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
                newNode = tail;

            } else {
                System.out.println("Head is null");
            }
        }

        public void clear(){
        head = null;
        tail = null;

        }

        public boolean contains(Object item) {
            if (!this.isHeadNull()) {
                Node currentNode = head;
                for (int i = 0; i < this.size(); i++) {
                    if (currentNode.data == item) {
                        return true;
                    } else {
                        currentNode = currentNode.next;
                    }

                }
                return false;
            } else {
                System.out.println("Head is null!");
                return false;
            }
        }

        public Object get(int index) {
            if (!this.isHeadNull()) {
                Node currentNode = head;
                if (index > this.size()) {
                    return "The index is outside of the size of the Linked List!!!";
                } else {
                    for (int i = 0; i < index; i++) {
                        currentNode = currentNode.next;
                    }
                    return currentNode.data;
                }
            } else {
                System.out.println("Head is null!");
            }
            return false;
        }

        public Boolean isHeadNull(){
            if(head != null){
                return false;
            }
            return true;
        }

        public Object getFirst(){
        if(head != null){
            return head;
        }else{
            return "There is no head in the linked list";
        }
        }

        public Object getLast(){
        if(!this.isHeadNull()){
            Node currentNode = head;
            for (int i = 0; i < this.size()-1; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
        return "The list is empty!";
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

    public int indexOf(Object data) {
        if (!this.isHeadNull()) {
            Node currentNode = head;
            for (int i = 0; i < this.size(); i++) {
                if (currentNode.data.equals(data)) {
                    return i;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }
            return -1;
        }

    public int lastIndexOf(Object data) {
        int highIndex = 0;
        if (!this.isHeadNull()) {
            Node currentNode = head;
            for (int i = 0; i <this.size(); i++) {
                if (currentNode.data.equals(data)) {
                    highIndex =  i;
                } else {
                    currentNode = currentNode.next;
                }
            }
            return highIndex;
        }
        return -1;
    }

    public Object poll(){
        Node headNode = head;
        if(head != null){
            Node currentNode = headNode.next;
            head = null;
            head = currentNode;
            return headNode.data;
        }else{
            return "There is no head in the linked list";
        }
    }

    public Object pollLast(){
        Node currentNode = head;
        if(head != null){
            for (int i = 0; i < this.size() - 2; i++) {
                currentNode = currentNode.next;
            }
            tail = null;
            tail = currentNode;


            Node finalNode = currentNode.next;
            currentNode.next = null;
            return finalNode.data;
        }else{
            return "There is no head in the linked list";
        }
    }

    public Object remove(int index){
        Node currentNode = head;
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }
        Node nextNode = currentNode.next;

        currentNode.next = currentNode.next.next;
        return nextNode.data;

    }


    public Object removeOBJ(Object obj){ //added remove oBJ because some objects are int's
        Node currentNode = head;
        int index = this.indexOf(obj);
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }
        Node nextNode = currentNode.next;

        currentNode.next = currentNode.next.next;
        return nextNode.data;

    }

    public Object set(int index, Object item){
        Node currentNode = head;
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }

        Object data = currentNode.data;

        currentNode.data = item;
        return data;

    }




    public void print() {
        if (!this.isHeadNull()) {
            Node currentNode = head;
            System.out.println(head.data);
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                System.out.println(currentNode.data);
            }
        } else {
            System.out.println("No Linked List Exists Yet");
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
