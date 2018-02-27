package doubly_linked_lists;

public class Link {
	public double dData;
	public Link next;
	public Link previous;
	
	public Link(double dData) {
		this.dData = dData;
		next = null;
		previous = null;
	}
	
	public void displayLink() {
		System.out.print(dData + " ");
	}
}
