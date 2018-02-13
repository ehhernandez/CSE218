package genericMethods;

public class GenericMethodDemo {

	public static void main(String[] args) {
		String[] names = {"Adam", "Bill", "Cathy"};
		Integer[] values = {1, 2, 3}; 
//		display(names);
		display(values);
	}
	
	
	// upper bound constraining
	private static <E extends Number> void display(E[] array) {
		for(E e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
//	private static <E> void display(E[] array) {
//		for(E e : array) {
//			System.out.print(e + " ");
//		}
//		System.out.println();
//	}
	
//	private static void display(String[] names) {
//		for(String str : names) {
//			System.out.print(str + " ");
//		}
//		System.out.println();
//	}
//	
//	private static void display(Integer[] numbers) {
//		for(Integer integer : numbers) {
//			System.out.print(integer + " ");
//		}
//		System.out.println();
//	}

}
