package ma.testjunit;

import junit.framework.TestCase;

import org.junit.Test;

public abstract class MyAbstractTest extends TestCase {

	/**
	 * A common test customized by the call to the {@link MyAbstractTest#getRole()} method
	 */
	@Test
	public void testMethod1() {
		System.out.println("Set login parameters ...");
		System.out.println("launch test for login: " + getRole());
		System.out.println("end of test for login: " + getRole());
	}

	/**
	 * Should be implemented in the subclasses to modify the abstract behavior
	 * 
	 * @return
	 */
	public abstract String getRole();
}
