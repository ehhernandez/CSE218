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
		for (int i = 0; i < nElems; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}

	public int remove(int value) {
		int indexFound = -1;
		for (indexFound = 0; indexFound < nElems; indexFound++) {
			if (value == intArray[indexFound]) {
				break;
			}
		}
		if (indexFound == nElems) {
			return -1;
		} else {
			for (int j = indexFound; j < nElems - 1; j++) {
				intArray[j] = intArray[j + 1];
			}
			nElems--;
			return indexFound;
		}

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
