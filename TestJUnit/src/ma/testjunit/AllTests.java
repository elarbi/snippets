package ma.testjunit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {

		TestSuite suite = new TestSuite(AllTests.class.getName());
		// Works fine
		suite.addTestSuite(TestA.class);
		suite.addTestSuite(TestB.class);

		return suite;
	}
}
