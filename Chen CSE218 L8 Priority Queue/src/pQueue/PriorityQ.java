package pQueue;

public class PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nElems;

	public PriorityQ(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		nElems = 0;
	}

	public void insert(long value) {
		int j;
		if (nElems == 0) { // if no items
			queArray[nElems++] = value;
		} else {
			for (j = nElems - 1; j >= 0; j--) {
				if (value > queArray[j]) { // if new item larger
					queArray[j + 1] = queArray[j]; // shift upward
				} else { // if new item not larger
					break;
				}
			}
			queArray[j + 1] = value;
			nElems++;
		}
	}
	
	public long remove() {
		return queArray[--nElems];
	}
	
	public long peekMin() {
		return queArray[nElems - 1];
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}

}
