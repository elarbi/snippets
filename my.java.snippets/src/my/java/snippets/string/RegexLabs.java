package my.java.snippets.string;

import java.util.regex.Pattern;

public class RegexLabs {
	
	public static void main(String[] args) {
		String A = "A";
		String O = "O";
		String Y = "Y";
		
		String pattern = "[[A-Z]&&[^O]]";
		
		
		System.out.println(A.matches(pattern));
		System.out.println(O.matches(pattern));
		System.out.println(Y.matches(pattern));
	}

}
