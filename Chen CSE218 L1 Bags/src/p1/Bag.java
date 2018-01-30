package p1;

public class Bag {
	private int[] intArray;
	private int nElems;
	
	public Bag(int maxSize) {
		intArray = new int[maxSize];
		nElems = 0;
	}
	
	public void add(int newValue) {
		intArray[nElems++] = newValue;
	}
	
	public void show() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
	
	public boolean remove(int value) {
		return false;
	}
	
	public boolean find(int value) {
		return false;
	}
	
	public int findMax() {
		return 0;
	}
	
	public int findMin() {
		return 0;
	}
	
	public int findMean() {
		return 0;
	}
	

}
