package sequentialSearch;

public class SequentialSearch {
	public static int sequentialSearch(int[] array, int value) {
		int index = 0;
		int element = -1;
		boolean found = false;

		while(!found && index < array.length) {
			if(array[index] == value) {
				found = true;
				element = index;
			}
			index++;
		}
		return element;
	}
}
