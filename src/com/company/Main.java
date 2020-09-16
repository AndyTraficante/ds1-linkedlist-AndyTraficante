package com.company;


public class Main {

    public static void main(String[] args) {
	LinkedList myList = new LinkedList();

	myList.add("hello");
	myList.add("2");
	myList.add(3);

		System.out.println(myList.size());

	myList.count(3, 10);

	myList.addFirst("andyyyyy");

	myList.addLast("7563856385639");

	System.out.println(myList.get(1));

	System.out.println(myList.contains(3444));

	myList.print();


    }
}
