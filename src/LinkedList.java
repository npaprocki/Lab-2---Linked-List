import java.util.NoSuchElementException;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

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
		String s = "";
		Node current = head;
		while (current != null) {
			s = s + current.data + " ";
			current = current.next;
		}
		return s;
	}

	/*
	 * Returns the first item in the list. If the list is empty, throw a
	 * NoSuchElementException.
	 */
	public int getFirst() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		int returnValue = head.data;
		return returnValue;
	}

	/*
	 * Returns the last item in the list. If the list is empty, throw a
	 * NoSuchElementException.
	 */
	public int getLast() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		int returnValue = tail.data;
		return returnValue;
	}

	/*
	 * Returns the item at the specified index. If the index is not valid, throw an
	 * IndexOutOfBoundsException.
	 */
	public int getAt(int index) {
		if (head == null || index >= size) {
			throw new NoSuchElementException();
		}
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}

	/*
	 * Inserts an item at the beginning of the list.
	 */
	public void insertFirst(int num) {
		Node n = new Node(num);
		if (head == null) {
// this is the first element in list
			head = n;
			tail = n;
			size++;
		} else {
// already an existing list
			n.next = head;
			head = n;
			size++;
		}
	}

	/*
	 * Inserts an item at the end of the list.
	 */
	public void insertLast(int num) {
		Node n = new Node(num);
		if (head == null) {
// this is the first element in list
			head = n;
			tail = n;
			size++;
		} else {
// already an existing list
			tail.next = n;
			tail = n;
			size++;
		}
	}

	/*
	 * Removes and returns the first element from the list. If the list is empty,
	 * throw a NoSuchElementException.
	 */
	public int removeFirst() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		int returnValue = head.data;
// is this the only element
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else if (size == 2) {
			head = tail;
			size--;
		} else {
// more than two elements in array
			head = head.next;
			size--;
		}
		return returnValue;
	}

	/*
	 * Removes and returns the last element from the list. If the list is empty,
	 * throw a NoSuchElementException.
	 */
	public int removeLast() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		int returnValue = tail.data;
// is this the only element
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else if (size == 2) {
			tail = head;
			size--;
		} else {
// more than two elements in array
// gotta get the next to last one
			Node current = head;
			while (current.next != tail) {
				current = current.next;
			}
			tail = current;
			current.next = null;
			size--;
		}
		return returnValue;
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
		return size == 0;
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