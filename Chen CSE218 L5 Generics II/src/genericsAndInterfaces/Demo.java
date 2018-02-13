package genericsAndInterfaces;

public class Demo {

	public static void main(String[] args) {
		String[] names = {"Adam", "Cathy", "Julie", "Billy", "Zack"};
		System.out.println(GenericSearch.sequentialSearch(names, "Billy"));
		
		Integer[] numbers = { 2, 1, 0, 4, 10, 6, 8, 5};
		System.out.println(GenericSearch.sequentialSearch(numbers, 8));
		
		System.out.println((new Integer(1).compareTo(new Integer(1))));
	}

}
