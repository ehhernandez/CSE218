package bubbleSort;

public class ArrayBub {
	private int[] a;
	private int nElems;
	
	public ArrayBub(int maxSize) {
		a = new int[maxSize];
		nElems = 0;
	}
	
	public void insert(int value) {
		a[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void bubbleSort() {
		int in;
		int out;
		int numberOfComparisons = 0;
		int numberOfSwaps = 0;
		for(out = nElems-1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
//				numberOfComparisons++;
				if(a[in] > a[in+1]) {
//					numberOfSwaps++;
					swap(in, in+1);
				}
			}
		}
//		System.out.println("Number of Comparisons: " + numberOfComparisons);
//		System.out.println("Number of Swaps: " + numberOfSwaps);

	}
	
	private void swap(int dex1, int dex2) {
		int temp = a[dex1];
		a[dex1] = a[dex2];
		a[dex2] = temp;
	}
}
