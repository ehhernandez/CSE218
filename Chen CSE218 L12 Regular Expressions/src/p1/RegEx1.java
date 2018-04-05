package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		String word = "fea 111 fea fsa fsafdsa fdafda fdsafsa";
		String patt = "\\d+";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(word);
		int counter = 0;
		String lastToken = "";
		while(match.find()) {
			counter++;
			lastToken = match.group();
			System.out.println(lastToken);
//			System.out.println("Found " + patt + " at " + match.start());
			System.out.println("Match: " + match.group());
		}
		if(counter > 1 && word.charAt(word.length() -1) == 'e' && lastToken.equals("e")) {
			counter--;
		}
		System.out.println("The number of syllables is: " + counter);
		
	}

}
