package insertionSort;

public class InsertionSortDemo {

	public static void main(String[] args) {
		ArrayInsertion arr = new ArrayInsertion(35);
		arr.insert(5);
		arr.insert(3);
		arr.insert(7);
		arr.insert(1);
		arr.insert(9);
		arr.insert(8);
		arr.insert(2);
		arr.insert(0);
		arr.insert(6);
		arr.insert(4);
		arr.insert(0);
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.insert(5);
		arr.insert(6);
		arr.insert(7);
		arr.insert(8);
		arr.insert(9);
		arr.insert(9);
		arr.insert(8);
		arr.insert(7);
		arr.insert(6);
		arr.insert(5);
		arr.insert(4);
		arr.insert(3);
		arr.insert(2);
		arr.insert(1);
		arr.insert(0);
		arr.insert(-1);
		arr.insert(-2);
		arr.display();
		long startTime = System.nanoTime();
		arr.insertionSort();
		System.out.println(System.nanoTime() - startTime);
		arr.display();
	}

}
