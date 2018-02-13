package sequentialSearch;

public class SequentialSearchDemo {

	public static void main(String[] args) {
		int valueLookingFor = 5;
		int[] scores = new int[20];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 10);
			System.out.print(scores[i] + " ");
		}
		
		System.out.println("\n" + SequentialSearch.sequentialSearch(scores, valueLookingFor));
	}

}
