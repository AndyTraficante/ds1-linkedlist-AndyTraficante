package com.company;


public class Main {

    public static void main(String[] args) {
	LinkedList myList = new LinkedList();

	myList.add("item 1");
	myList.add("2");
	myList.add(3);

		System.out.println("The list is " + myList.size() + " objects long");

	//myList.add(3, 10);

	//myList.addFirst("0");

	//myList.addLast(4);

		System.out.println("Last item is :" + myList.getLast());

		System.out.println("First index find :" + myList.indexOf(3));
		System.out.println("last index find :" + myList.lastIndexOf(3));

	System.out.println("Getting Index :" + myList.get(1));

	System.out.println("Checking contents :" +myList.contains(3444));

		//System.out.println(myList.poll());
		//System.out.println(myList.pollLast());

		//System.out.println(myList.removeOBJ(2));

		System.out.println(myList.set(0, 5));

	myList.print();


    }
}
