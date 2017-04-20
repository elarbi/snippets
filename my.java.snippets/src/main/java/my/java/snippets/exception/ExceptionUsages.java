package my.java.snippets.exception;

public class ExceptionUsages {
	
	public static void main(String[] args) {
		try {
			
			throw new NullPointerException("pb occurs!");
			
		} catch (RuntimeException e) {
			throw new ClassCastException("another pb!");
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("Finally !");
		}
		
		
	}

}
