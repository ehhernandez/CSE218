package p2;

public class Bag {
	private String[] strArray;
	private int nElems;

	public Bag(int maxSize) {
		strArray = new String[maxSize];
		nElems = 0;
	}
	
	public void add(String newValue) {
		strArray[nElems++] = newValue;
	}
	
	public void show() {
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println();
	}
	
	public boolean remove(String value) {
		return false;
	}
	
	public boolean find(String value) {
		return false;
	}
}
