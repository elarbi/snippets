package my.java.snippets.inheritance;

public class InheritTest {
	public static void main(String[] args) {
		
		B b = new B();
	
		
		if(b instanceof A){
			System.out.println("b is of Type A" );
		} 
		if(b instanceof B){
			System.out.println("b is of Type B" );
		}
	}

}
