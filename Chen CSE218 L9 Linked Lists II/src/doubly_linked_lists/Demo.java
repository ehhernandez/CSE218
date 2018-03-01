package doubly_linked_lists;

public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.displayForward();
		theList.insertAfter(11, 99);
		theList.displayForward();
	}

}
