package double_ended_lists;

public class Demo {

	public static void main(String[] args) {
		LinkList myList = new LinkList();
		myList.insertFirst(11);
		myList.insertFirst(22);
		myList.insertFirst(33);
		myList.insertLast(44);
		myList.displayList();
		System.out.println(myList.deleteFirst());
		myList.displayList();
	}

}
