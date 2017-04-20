package my.java.snippets.exception;

public class ExceptionHierarchy {
	
	public static void main(String[] args) {
		try {
			
//			throw new ClassCastException("pb occurs!");
			int i = 0;
			
			
			
		} catch (NullPointerException npe ) {
			System.err.println("NPE");
			//throw new ClassCastException("another pb!");
		} catch (Exception e) {
			System.err.println("E");
		}
		finally {
			System.err.println("Finally !");
		}
		
		
	}

}
