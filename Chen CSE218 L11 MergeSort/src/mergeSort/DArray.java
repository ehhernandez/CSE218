package mergeSort;

public class DArray {
	private long[] theArray;
	private int nElems;
	
	public DArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	public void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2; // find mid point
			recMergeSort(workspace, lowerBound, mid);  // sort low half
			recMergeSort(workspace, mid+1, upperBound); // sort high half
			merge(workspace, lowerBound, mid+1, upperBound); // merge low and high haves
		}
	}
	
	public void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j = 0; // workspace index
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1; // # of items
		
		while(lowPtr <= mid && highPtr <= upperBound) {
			if(theArray[lowPtr] < theArray[highPtr]) {
				workspace[j++] = theArray[lowPtr++];
			} else {
				workspace[j++] = theArray[highPtr++];
			}
		}
		
		while(lowPtr <= mid) {
			workspace[j++] = theArray[lowPtr++];
		}
		
		while(highPtr <= upperBound) {
			workspace[j++] = theArray[highPtr++];
		}
		
		for(j = 0; j <n; j++) {
			theArray[lowerBound + j] = workspace[j];
		}
	}
	
	public void insert(long value) {
		theArray[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
	
	public void mergeSort() {
		long[] workspace = new long[nElems];
		recMergeSort(workspace, 0, nElems -1);
	}
}
