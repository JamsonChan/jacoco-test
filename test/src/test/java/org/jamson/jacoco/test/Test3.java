/* Test3.java

        Purpose:
                
        Description:
                
        History:
                Mon Mar 11 11:57:02 CST 2024, Created by jamson

Copyright (C) 2024 Potix Corporation. All Rights Reserved.
*/
package org.jamson.jacoco.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jamson.jacoco.prj4.Project4;
import org.junit.jupiter.api.Test;

public class Test3 {
	@Test
	public void test() {
		assertEquals(2, new Project4().divide(2, 1));
	}
}
