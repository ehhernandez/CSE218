package doubly_linked_lists;

public class DoublyLinkedList {
	private Link first;
	private Link last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Link deleteLast() {
		Link temp = last;
		if(first.next == null) { // one item in the list
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	
	public Link deleteFirst() { // assume not empty
		Link temp = first;
		if(first.next == null) { // only one item in the list
			last = null;
		} else { // more than one item
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
}
