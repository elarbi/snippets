package my.java.snippets.string;

public class Split {
	public static void main(String[] args) {
		String string = "aaa\\bbbb"; // "\" is a special character in strings we need to escape the "\" with another one
		System.out.println(string);
		String[] split = string.split("\\\\");  // "\" is a special character in Regex we need to escape the two "\" with two others
		System.err.println(split[0]);
	}
}
