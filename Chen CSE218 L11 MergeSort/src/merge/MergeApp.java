package merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {7, 23, 81, 95};
		int[] arrayB = {7, 7, 39, 55, 62, 74};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		
		merge(arrayA, 4, arrayB, 6, arrayC) ;
		display(arrayC, 10);
	}
	
	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while(aIndex < sizeA && bIndex < sizeB) {
			if(arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}
		
		while(aIndex < sizeA) {
			arrayC[cIndex++] = arrayA[aIndex++];
		}
		
		while(bIndex < sizeB) {
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}
	
	public static void display(int[] theArray, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

}
