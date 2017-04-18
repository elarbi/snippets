package my.java.snippets.finally_;

public class FinallyReturn {

	public static void main(String[] args) {
		try {
			
			System.out.println("TRY block executes");
			return;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("FINALLY block executes");
		}
	}
}
