package simpleListedList;

public class Demo {

	public static void main(String[] args) {
		LinkList myList = new LinkList();
		myList.insertFirst(1);
		myList.insertFirst(2);
		myList.insertFirst(3);
		myList.insertFirst(4);
		myList.displayList();
//		myList.deleteFirst();
//		myList.deleteFirst();
//		myList.displayList();
		
		myList.delete(1);
		myList.displayList();
	}

}
