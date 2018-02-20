package stackToMatchBrackets;

public class Demo {

	public static void main(String[] args) {
		String input = "(fd{f})fs)";
		BracketChecker theChecker = new BracketChecker(input);
		theChecker.check();
		
	}

}
