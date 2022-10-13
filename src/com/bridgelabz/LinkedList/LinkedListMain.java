package com.bridgelabz.LinkedList;
import java.util.Scanner;// import scanner class

public class LinkedListMain {
	public static void main(String[] args) {
		//create object for linkedlist class coz no one method is static in this class
		LinkedList linkedList = new LinkedList();
		//create scanner class and object scanner class read java user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to DataStructure Program\n\n" + "Choose your option:\n" + "1. Create a simple LinkedList\n");
		int option = sc.nextInt();
		System.out.println();
		//using switch case,they check the condition if they got condition is true then the stop searching and break it.
		switch (option) {
		case 1:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			linkedList.print();
			break;
		}
	}
}