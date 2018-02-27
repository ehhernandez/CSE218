package double_ended_lists;

public class LinkList {
	private Link first;
	private Link last;
	
	public LinkList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
//	public double deleteLast() {
//		double temp = last.dData;
//		if(first.next == null) {
//			first = null;
//		}
//		last.previous.next = null;
//		
//		return temp;
//	}
	
	public double deleteFirst() {
		double temp = first.dData;
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}
		last.next = newLink;
		last = newLink;
	}
}
