package binarySearch;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(BinarySearch.binarySearch(numbers, 3));
	}
	
	/*
	 * NumberOfDataItems	(N)		logN			formula
	 * 1							0			2^0
	 * 2							1			2^1
	 * 4							2			2^2
	 * 8							3			2^3
	 * 16						4			2^4
	 * 32						5
	 * 64						6
	 * 128						7
	 * 256						8
	 * 
	 */
	
	/*
	 * range			maxComparisonsNeeded
	 * 10				4
	 * 100				7
	 * 1,000				10
	 * 10,000			14
	 * 100,000			17
	 * 1,000,000			20
	 * 10,000,000		24
	 * 100,000,000		27
	 * 1,000,000,000	 	30
	 */

}
