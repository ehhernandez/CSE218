package stackToMatchBrackets;

public class BracketChecker {
	private String input;
	
	public BracketChecker(String in) {
		input = in;
	}
	
	public void check() {
		int stackSize = input.length();
		StackX theStack = new StackX(stackSize);
		
		for(int j = 0; j< input.length(); j++) {
			char ch = input.charAt(j);
			switch(ch) {
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!theStack.isEmpty()) {
					char chx = (char)theStack.pop(); // pop and check
					if((ch == '}' && chx!= '{') ||
					(ch == ']' && chx!= '[') ||
					(ch == ')' && chx!= '(')) {
						System.out.println("Error: " + ch + " at " + j);
					}
				} else { // premature empty
					System.out.println("Error: " + ch + " at " + j);
				}
				break;
				default: 
					break;
			} // end switch
			
		} // end for
		
		// at this point, all characters have been processed
		
		if(!theStack.isEmpty()) {
			System.out.println("Error: missing right delimiter.");
		} else {
			System.out.println("All is well!");
		}
	} // end check
} // end class
