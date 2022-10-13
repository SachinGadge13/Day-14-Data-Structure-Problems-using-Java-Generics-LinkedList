package com.bridgelabz.LinkedList;

public class LinkedList {
	Node head;

	// class Node that hold data and a reference/link to the next Node in the list
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Method to add a node at the beginning of the list
	public Node insert(int data) {
		// Check if the list is empty
		Node newNode = new Node(data);
		if (head == null) {
			// Make the new node as head
			head = newNode;
		} else {
			Node temp = head;
			// traverse to the end of the list
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}

	// create a print method
	public void print() {
		// head store in temp variable
		Node temp = head;
		// While loop using If temp is not equal to null then print data
		while (temp != null) {
			System.out.print(temp.data + "> ");
			temp = temp.next;
		}
	}

	// create a push method for adding new node and passing parameter
	public void push(int data) {
		// Create a new node
		Node newNode = new Node(data);
		// new node is head
		newNode.next = head;
		head = newNode;
	}

	// create a method for Insert 30 between 56 and 70
	public void insertAfter(Node prevNode, int value) {
		// condition is checked
		if (prevNode == null) {
			System.out.println("Prev Node should not be null");
			return;
		}
		// create new node inserting 30 btwn 56 and 70
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	/*
	 * creat a method name as pop in pop method used for deleting element here this
	 * is used for delete 1st element in linked list
	 */
	public int pop() {
		// variable
		int popData = 0;
		if (head == null) {
			System.out.println("Stack over flow ");
		}
		popData = head.data;
		head = head.next;
		return popData;
	}

	// Methodto delete last element in linked list
	public void popLast() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		if (head == null) {
			System.out.println(head.data);
			head = null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		System.out.println("Delete last node::");
	}

	// create method name as search passing parameter name as int val.
	public int search(int val) {
		// check list empty or not
		if (head == null) {
			System.out.println("List is Empty");
			return -1;
		}
		int index = 1;
		Node newNode = head;
		// while loop is usednew Node is not empty
		while (newNode != null) {
			// condition checked if condition is true then break this loop position of 30 is
			// 2
			if (newNode.data == val) {
				break;
			}
			index++;
			newNode = newNode.next;
		}
		return index;
	}

	// Method to add a node at the specified position in the list
	public void insertelement(int position, int data) {
		Node node = new Node(data);
		// Point the new node's next to head
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			Node previous = head;
			int count = 1; // position - 1
			// while loop is used
			while (count < position - 1) {
				// update prev to point to new node
				previous = previous.next;
				count++;
			}
			Node temp = previous.next;
			previous.next = node;
			node.next = temp;
		}
	}

	// create a method deleteNode and passing parameter.
	public void deleteANode(int value) {
		if (this.head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node tempNode = head;
		while (tempNode.next.data != value) {
			tempNode = tempNode.next;
		}
		Node previousNode = tempNode;
		Node nextNode = tempNode.next.next;
		previousNode.next = nextNode;
	}
}