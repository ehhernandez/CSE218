package shellSort;

public class ArrayShell {
	private long[] theArray;
	private int nElems;

	public ArrayShell(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void shellSort() {
		int inner;
		int outer;
		long temp;

		int h = 1; // initial gap
		while (h < nElems / 3) { // find the largest usable gap
			h = h * 3 + 1; // 1, 4, 13, 40, 121, 364, 1093
		}

		while (h > 0) { // decreasing h, until h = 1
			for (outer = h; outer < nElems; outer++) { // h-sort the array
				temp = theArray[outer];
				inner = outer;

				while (inner > h - 1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				} // end while
				theArray[inner] = temp;
			} // end for
			h = (h - 1) / 3;
		} // end while
	} // end shellsort

	public void insert(long value) {
		theArray[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
}
