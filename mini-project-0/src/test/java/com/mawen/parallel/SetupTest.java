package com.mawen.parallel;

import junit.framework.TestCase;

public class SetupTest extends TestCase {

	/**
	 * A simple test case.
	 */
	public void testSetup() {
		final int result = Setup.setup(42);
		assertEquals(42, result);
	}
}