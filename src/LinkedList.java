import java.util.NoSuchElementException;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size;

	// creating a node sets next to null

	/*
	 * Creates an empty list.
	 */

	public LinkedList() {

	}

	/*
	 * Returns a space-separated list of the elements in the list. If the list
	 * contains no elements, return an empty string ""
	 */
	public String toString() {

		if (isEmpty()) {
			return "";
		}

		Node current = head;
		StringBuilder output = new StringBuilder();

		while (current != null) {

			output.append(current.data + " ");
			current = current.next;

		}

		return output.toString();
	}

	/*
	 * Returns the first item in the list. If the list is empty, throw a
	 * NoSuchElementException.
	 */
	public int getFirst() {
		return 0;
	}

	/*
	 * Returns the last item in the list. If the list is empty, throw a
	 * NoSuchElementException.
	 */
	public int getLast() {
		return 0;
	}

	/*
	 * Returns the item at the specified index. If the index is not valid, throw an
	 * IndexOutOfBoundsException.
	 */
	public int getAt(int index) {
		return 0;
	}

	/*
	 * Inserts an item at the beginning of the list.
	 */
	public void insertFirst(int num) {

		if (isEmpty()) {
			Node newNode = new Node(num);

			head = newNode;
			tail = newNode;
			
			head.next = tail;
			
		} else {

			Node newNode = new Node(num);
			
			newNode.next = head;
			
			head = newNode;
			

		}
		
		tail.next = null;


		size++;
	}

	/*
	 * Inserts an item at the end of the list.
	 */
	public void insertLast(int num) {


		Node nextNode = new Node(tail.data);
		nextNode.next = tail;
		tail.data = num;

		Node current = head;

		for (int index = 0; index < size - 1; index++) {

			if (current.next == tail) {
				current.next = nextNode;
			}

			current = current.next;

		}

		size++;

	}

	/*
	 * Removes and returns the first element from the list. If the list is empty,
	 * throw a NoSuchElementException.
	 */
	public int removeFirst() {

		try {

			if (isEmpty()) {
				throw new NoSuchElementException();
			}

		} catch (NoSuchElementException ex) {
			ex.getMessage();
		}

		int oldData = head.data;

		head.data = (head.next).data;
		head.next = (head.next).next;

		size--;

		return oldData;
	}

	/*
	 * Removes and returns the last element from the list. If the list is empty,
	 * throw a NoSuchElementException.
	 */
	public int removeLast() {
		
		try {

			if (isEmpty()) {
				throw new NoSuchElementException();
			}

		} catch (NoSuchElementException ex) {
			ex.getMessage();
		}

		int oldData = tail.data;
		
		Node current = head;
		
		for (int index = 0; index < size - 1; index++) {

			if (current.next == tail) {
				tail.data = current.data;
				current.next = null;
			}

			current = current.next;

		}


		size--;

		return oldData;
	}

	/*
	 * Returns the number of elements in the list.
	 */
	public int getSize() {
		return size;
	}

	/*
	 * Returns true if the list is empty, and false otherwise.
	 */
	public boolean isEmpty() {

		if (head == null) {

			return true;

		}

		return false;
	}

	// A private Node class. By making it an inner class,
	// the outer class can access it easily, but the client cannot.
	private class Node {
		private int data;
		private Node next;

		// Constructs a new node with the specified data
		private Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}