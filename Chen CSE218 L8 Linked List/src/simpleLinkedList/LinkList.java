package simpleLinkedList;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public Link find(int key) { // assume list not empty
		Link current = first;
		while(current.getNumber() != key) {
			if(current.getNext() == null) {
				return null; // key does not exist
			} else {
				current = current.getNext();
			}
		}
		return current; // key found
	}
	
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		while (current.getNumber() != key) {
			if(current.getNext() == null) {
				return null;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		if(current == first) {
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		return current;
	}

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	public Link deleteFirst() { //delete first link
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public void insertFirst(int number) { // insert as first link
		Link newLink = new Link(number);
		newLink.setNext(first);
		first = newLink;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.getNext();
		}
		System.out.println();
	}

}
