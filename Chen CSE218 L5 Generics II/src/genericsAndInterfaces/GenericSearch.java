package genericsAndInterfaces;

public class GenericSearch {
	public static <E extends Comparable<E>>int sequentialSearch(E[] array, E value) {
		int index = 0;
		int position = -1;
		boolean found = false;
		
		while (!found && index < array.length) {
			if(array[index].compareTo(value) == 0) {
				found = true;
				position = index;
			}
			index++;
		}
		return position;
	}
}
