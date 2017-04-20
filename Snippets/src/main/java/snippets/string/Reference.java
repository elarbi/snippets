package snippets.string;

public abstract class Reference {
	
	static void changeStringValue(String s) {
		s += "B"; 
	}

	public static void main(String[] args) {
		String a = "AB";
		String b = "A";
		
		b=b+"B";
		
		if(a==b) {
			System.out.println("a==b is true");
		}else
			System.out.println("a==b is FALSE!");

	}
}
