package listInterator;

public class ListIterator {
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list) {
		ourList = list;
		reset();
	}
	
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd() {
		return current.next == null;
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent() {
		return current;
	}
	
	public void insertAfter(long dData) { // insert newLink after current link
		Link newLink = new Link(dData);
		
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	public void insertBefore(long dData) { // insert newLink before current link
		Link newLink = new Link(dData);
		
		if(previous == null) { // beginning of list or empty list
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public long deleteCurrent() { // delete item at current
		long value = current.dData;
		if(previous == null) { // beginning of list
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if(atEnd()) {
				reset();
			}
		}
		return value;
	}
	
}
