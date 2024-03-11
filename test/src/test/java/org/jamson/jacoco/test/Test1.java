/* Test1.java

        Purpose:
                
        Description:
                
        History:
                Mon Mar 11 11:56:06 CST 2024, Created by jamson

Copyright (C) 2024 Potix Corporation. All Rights Reserved.
*/
package org.jamson.jacoco.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jamson.jacoco.prj2.Project2;
import org.junit.jupiter.api.Test;

public class Test1 {
	@Test
	public void test() {
		assertEquals(1, new Project2().minus(2, 1));
	}
}
