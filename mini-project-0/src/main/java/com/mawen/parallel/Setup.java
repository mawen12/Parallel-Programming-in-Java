package com.mawen.parallel;

import static edu.rice.pcdp.PCDP.*;

/**
 * A simple class for testing compilation of an PCDP project.
 *
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/2/18
 */
public class Setup {

	private Setup(){}

	/**
	 * A simple method for testing compilation of an PCDP project.
	 * @param val Input value
	 * @return Dummy value
	 */
	public static int setup(final int val) {
		final int[] result = new int[1];
		finish(() -> {
			async(() -> {
				result[0] = val;
			});
		});
		return result[0];
	}
}
