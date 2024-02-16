

public class LLDriver {

	public static void main(String[] args) {

		// As we test our methods, make sure the method works as expected...
		// ...with an empty list
		// ...with a non-empty list
		// **** YOU CAN MAKE ANY CHANGES YOU WANT TO THE CODE IN THIS METHOD ****
		// It is your tester. Test thoroughly.
		// As we test our methods, make sure the method works as expected...
		// ...with an empty list
		// ...with a non-empty list

		System.out.println("Test 1 - print empty list");
		LinkedList list = new LinkedList();
		System.out.println("?" + list.toString());


		
		System.out.println("Test 2 - add 2 elements to front of list (insertFirst)");
		list.insertFirst(17);
		list.insertFirst(20);
		System.out.println("20 17? " + list.toString());


		System.out.println("Test 3 - add 2 elements to end of list (insertLast)");
		list.insertLast(50);
		list.insertLast(51);
		System.out.println("20 17 50 51? " + list.toString());

		// add test of removeFirst
		System.out.println("Test 4- removeFirst");
		int num = list.removeFirst();
		System.out.println("Removed : " + num);
		System.out.println("17 50 51? " + list.toString());
		
		// add test of removeLast	
		System.out.println("Test 5 - remove Last");
		// TBD add code to test removeLast method
		num = list.removeLast();
		System.out.println("Removed : " + num);
		System.out.println("17 50? " + list.toString());
		
		
		// add test of getSize()
		System.out.println("Test 6 = get size");
		System.out.println("Current size = (should be 2) " + list.getSize());

		// add test of getFirst() and getLast() - these
		// methods should not change the list
		
		System.out.println("Test 7 - getFirst ");
	    list.insertFirst(66);
	    System.out.println("First number is (should be 66)" + list.getFirst());
		
		System.out.println("Test 8 - getLast");
		list.insertLast(999);
		System.out.println("Last number is : (should be 999)" + list.getLast());

		System.out.println("66 17 50 999 ? " + list.toString());

		// add test to clear list- list should be empty
		System.out.println("Test 9- test emptying list");
		// TBD add code to empty list

		while (!list.isEmpty()) {
			
			list.removeLast();
			
		}
		
		System.out.println("List should be empty ? " + list.toString());

		System.out.println("Test 10 - add single number and getFirst and getLast return same value");
		// add a single number
		// TBD add code to add single number and test getFirst and getLast return same value
		list.insertFirst(10);
		System.out.println("getFirst (should return 10): " + list.getFirst());
		System.out.println("getLast (should return 10): " + list.getLast());
		// repeat get/first and get/last and make sure both return that single
		// number
		// add test of getFirst() and getLast() - these
		// methods should not change the list
		
		
		System.out.println("Test 11 - add three more numbers and getAt index 1");
		// add a single number
		// TBD add code to add single number and test getFirst and getLast return same value
		list.insertFirst(50);
		list.insertFirst(22);
		list.insertFirst(25);
		
		System.out.println("25 22 50 10? " + list.toString());
		System.out.println("getAt(1) (should return 22): " + list.getAt(1));
		
		
		
	}

}
