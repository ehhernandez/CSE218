package doubly_linked_lists;

public class DoublyLinkedList {
	private Link first;
	private Link last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean insertAfter(double key, double dData) {
		Link newLink = new Link(dData);
		Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		if(current == last) {
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		
		newLink.previous = current;
		current.next = newLink;
		return true;
		
	}
	
	public Link deleteKey(double key) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		Link match = current; //shallow copy
		
		if(match == first) {
			first = match.next;
		} else {
			match.previous.next = match.next;
		}
		
		if(match == last) {
			last = match.previous;
		} else {
			match.next.previous = match.previous;
		}
		
		return match;
	}
	
	public boolean insertBefore(double key, double dData) {
		Link newLink = new Link(dData);
		Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		// a match is found
		if(current == first) {
			newLink.next = first;
			first.previous = newLink;
			first = newLink;
		}  else {
			newLink.next = current;
			current.previous.next = newLink;
			newLink.previous = current.previous;
			current.previous = newLink;
		}
		return true;
	}
	
	public void displayForward() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		Link current = last;
		while (current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
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
